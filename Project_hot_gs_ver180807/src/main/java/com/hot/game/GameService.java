package com.hot.game;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.file.FileDTO;
import com.hot.game.file.GameFileDAO;
import com.hot.game.file.GameFileDTO;
import com.hot.jsoup.JsoupForSteam;
import com.hot.jsoup.SteamReviewJsoupDTO;
import com.hot.member.MemberDTO;
import com.hot.orders.OrdersDAO;
import com.hot.orders.OrdersDTO;
import com.hot.review.ReviewDAO;
import com.hot.util.file.FileUploader;
import com.hot.util.page.GameSearchInfo;
import com.hot.util.page.Pager;

@Service
@Transactional
public class GameService {

	@Inject
	private GameDAO gameDAO;
	@Inject
	private OrdersDAO ordersDAO;
	@Inject
	private ReviewDAO reviewDAO;
	@Inject
	private GameFileDAO gameFileDAO;
	@Inject
	private FileUploader fileUploader;
	
	public void homeGameList(Model model) {
		List<GameDTO> hotGameList = gameDAO.hotGameList(); // 핫겜릿
		List<GameDTO> newGameList = gameDAO.newGameList(); // 뉴겜릿
		List<GameDTO> recommendGameList = gameDAO.recommendGameList(); // 춧겜릿
		List<GameDTO> saleGameList = gameDAO.saleGameList(); // 셀겜릿

		// 세일 체크
		Timestamp curDate = gameDAO.getCurDate();
		this.gamesSaleCheck(hotGameList, curDate);
		this.gamesSaleCheck(newGameList, curDate);
		this.gamesSaleCheck(recommendGameList, curDate);
		this.gamesSaleCheck(saleGameList, curDate);
		
		// model에 담기
		model.addAttribute("hotGameList", hotGameList);
		model.addAttribute("newGameList", newGameList);
		model.addAttribute("recommendGameList", recommendGameList);
		model.addAttribute("saleGameList", saleGameList);
	}
	
	// 주석 귀찮다
	public int gameCancelSale (int g_num) {
		return gameDAO.gameCancelSale(g_num);
	}
	
	// 세일입니다 ㅠㅠ
	public int gameSale (GameDTO gameDTO) {
		return gameDAO.gameSale(gameDTO);
	}
	
	// 추천 게임에서 삭제
	public int gameCancelRecommend (int g_num) {
		return gameDAO.gameCancelRecommend(g_num);
	}
	
	// 추천 게임으로 지정
	public int gameRecommend(int g_num) {
		return gameDAO.gameRecommend(g_num);
	}
	
	// 게임 정보 삭제
	public int delete(HttpSession session, int g_num) throws Exception {
		List<GameFileDTO> files = gameFileDAO.selectImgs(g_num);

		int result = gameFileDAO.imgsDeleteWithG_num(g_num);
		if (result > 0) {
			result *= gameDAO.delete(g_num);
		}
		boolean check = true;
		if (result > 0) {
			for (GameFileDTO gameFileDTO : files) {
				if (gameFileDTO.getKind().equals("main")) {
					if(!gameFileDTO.getFname().equals("defaultMainImg.jpg")) {
						String path = session.getServletContext().getRealPath("resources/upload/images/game/main");
						File file = new File(path, gameFileDTO.getFname());
						check &= file.delete();
					}
				} else {
					String path = session.getServletContext().getRealPath("resources/upload/images/game/sub");
					File file = new File(path, gameFileDTO.getFname());
					check &= file.delete();
				}
			}
		}
		result = check ? 1 : 0;
		return result;
	}
	
	// 게임 이미지 삭제
	public int subImgDeleteWithFname(HttpSession session, String fname) throws Exception {
		int result = 0;
		result = gameFileDAO.subImgDeleteWithFname(fname);
		if (result > 0) {
			String path = session.getServletContext().getRealPath("resources/upload/images/game/sub");
			File file = new File(path, fname);
			file.delete();
		}
		return result;
	}
	
	// 메인 이미지 변경
	public String mainImgUpdate(HttpSession session, RedirectAttributes redirectAttributes,
			MultipartFile mainImg, GameFileDTO orgGameFileDTO) throws Exception {
		
		// 기존 메인 이미지 정보 가져오기
		orgGameFileDTO = gameFileDAO.selectImgWithGf_num(orgGameFileDTO.getGf_num());
		String path = session.getServletContext().getRealPath("resources/upload/images/game/main");
		
		// 새로운 메인 이미지 업로드
		FileDTO fileDTO = fileUploader.upload(mainImg, path);
		
		// DB의 메인 이미지 정보 업데이트
		GameFileDTO newGameFileDTO = new GameFileDTO();
		newGameFileDTO.setGf_num(orgGameFileDTO.getGf_num());
		newGameFileDTO.setOname(fileDTO.getFname());
		newGameFileDTO.setFname(fileDTO.getFname());
		int result = gameFileDAO.imgUpdate(newGameFileDTO);
		
		String message = "이미지 변경에 실패하였습니다."; // alert 메시지
		if(result > 0) { // DB의 이미지 정보 변경에 성공하였다면
			// 기존 메인 이미지가 default 이미지가 아니라면 파일 삭제
			if(!orgGameFileDTO.getFname().equals("defaultMainImg.jpg")) {
				File file = new File(path, orgGameFileDTO.getFname());
				file.delete();
			}
			message = "이미지가 변경되었습니다.";
		} else { // DB의 이미지 정보 변경에 실패하였다면
			// 새로운 이미지 파일 삭제
			File file = new File(path, newGameFileDTO.getFname());
			file.delete();
		}
		
		redirectAttributes.addFlashAttribute("message", message);
		
		String addr = "redirect:./gameImgUpdate?g_num=" + orgGameFileDTO.getG_num();
		
		return addr;
	}
	

	
	// 게임  서브 이미지 업로드
	public String filesUpdate(HttpSession session, RedirectAttributes redirectAttributes,
			List<MultipartFile> files, GameFileDTO gameFileDTO) throws Exception {
		
		String message = "서브 이미지 업로드에 실패하였습니다. "; // alert 메시지
		String redirect = "redirect:./gameImgUpdate?g_num=" + gameFileDTO.getG_num(); // redirect 할 경로
		
		gameFileDTO.setKind("sub");
		String path = session.getServletContext().getRealPath("resources/upload/images/game/sub"); // 서브 파일 저장 경로
		System.out.println(path);
		int result = 1;
		for (MultipartFile file : files) {
			result *= this.fileUpload(file, gameFileDTO, path);
		}
		
		if (result > 0) {
			message = "서브 이미지 업로드에 성공하였습니다.";
		}
		
		redirectAttributes.addFlashAttribute("message", message);
		return redirect;
	}

	// 게임 이미지 관리 - GET
	public ModelAndView gameImgUpdate(int g_num) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		// GameFileDTO 생성 및 g_num 입력
		GameFileDTO gameFileDTO = new GameFileDTO();
		gameFileDTO.setG_num(g_num);
		
		// 메인 이미지 가져오기
		gameFileDTO.setKind("main");
		GameFileDTO mainImg = gameFileDAO.selectImg(gameFileDTO);
		
		if(mainImg == null) {
			throw new Exception();
		} else {
			// 서브 이미지 갯수 가져오기
			int subImgsCnt = gameFileDAO.subImgCnt(g_num);
			
			// 서브 이미지가 있다면 서브 이미지 가져오기
			if(subImgsCnt > 0 ) {
				gameFileDTO.setKind("sub");
				List<GameFileDTO> subImgs = gameFileDAO.selectImgs(gameFileDTO);
				modelAndView.addObject("subImgs", subImgs);
			}
			
			// 게임 정보 가져오기
			GameDTO gameDTO = gameDAO.selectOne(g_num);
	
			// ModelAndView에 데이터 저장
			modelAndView.addObject("g_num", g_num);
			modelAndView.addObject("game", gameDTO);
			modelAndView.addObject("mainImg", mainImg);
			modelAndView.addObject("subImgCnt", subImgsCnt);
			
			// Forward 경로
			modelAndView.setViewName("game/gameImgUpdate");
		}

		return modelAndView;
	}

	// 게임 정보 수정 - GET
	public ModelAndView infoUpdate(int g_num) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		GameDTO gameDTO = gameDAO.selectOne(g_num); // 게임 정보 가져오기
		String viewName = "error/noSuchGame"; // forward할 경로
		if(gameDTO != null) {
			modelAndView.addObject("game", gameDTO); // ModelAndView에 게임 정보 입력
			viewName = "game/gameInfoUpdate";
		}
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	// 게임 정보 수정 - POST
	public String infoUpdate(RedirectAttributes redirectAttributes, GameDTO gameDTO) throws Exception {
		int result = gameDAO.update(gameDTO); // 게임 정보 수정 및 결과 값 받기
		String message = "게임 정보 수정에 실패하였습니다."; // alert 메시지
		String redirect = "redirect:./gameInfoUpdate?g_num=" + gameDTO.getG_num(); // redirect할 경로
		if (result > 0) { // 게임 정보 수정 성공 하였다면
			message = "게임 정보가 수정되었습니다.";
			redirect = "redirect:./gameView?g_num=" + gameDTO.getG_num();
		}
		redirectAttributes.addFlashAttribute("message", message);
		return redirect;
	}

	// 게임 정보 보기
	public ModelAndView selectOne(HttpSession session, int g_num) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		GameDTO gameDTO = gameDAO.selectOne(g_num); // 게임 정보 가져오기
		String viewName = ""; // forward할 경로
		
		if(gameDTO != null) {
			// 세일상태 확인
			Timestamp curDate = gameDAO.getCurDate();
			this.gameSaleCheck(gameDTO, curDate);
			
			// DTO 생성 및 g_num 입력
			GameFileDTO gameFileDTO = new GameFileDTO();
			gameFileDTO.setG_num(g_num);
			
			// 메인 이미지 가져오기
			gameFileDTO.setKind("main");
			GameFileDTO mainImg = gameFileDAO.selectImg(gameFileDTO);
			
			// steam 리뷰 정보 가져오기
			SteamReviewJsoupDTO steamReview;
			String steamAppId = gameDTO.getSteamAppId();
			if(steamAppId != null && !steamAppId.equals("")) {
				steamReview = new SteamReviewJsoupDTO();
				steamReview = new JsoupForSteam().getReviews(steamAppId);
				modelAndView.addObject("steamReview", steamReview);
			}
			
			// 서브 이미지 갯수 가져오기
			int subImgCnt = gameFileDAO.subImgCnt(g_num);
			
			// 서브 이미지 가져오기
			List<GameFileDTO> subImgs = null;
			if (subImgCnt > 0) {
				gameFileDTO.setKind("sub");
				subImgs = gameFileDAO.selectImgs(gameFileDTO);
			}
			
			// 리뷰 가져오기
			int reviewCnt = reviewDAO.getTotalRow(g_num); // 리뷰의 갯수
			modelAndView.addObject("reviewCnt", reviewCnt);
			
			// 주문상태 가져오기
			MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
			OrdersDTO ordersDTO = null;
			if(memberDTO != null) {
				ordersDTO = new OrdersDTO();
				ordersDTO.setEmail(memberDTO.getEmail());
				ordersDTO.setG_num(g_num);
				ordersDTO = ordersDAO.ordersSelectOne(ordersDTO);
			}
			
			modelAndView.addObject("game", gameDTO);
			modelAndView.addObject("mainImg", mainImg);
			modelAndView.addObject("subImgCnt", subImgCnt);
			modelAndView.addObject("subImgs", subImgs);
			modelAndView.addObject("orders", ordersDTO);
			viewName = "game/gameView";
		} else {
			throw new Exception();
		}
		

		modelAndView.setViewName(viewName);
		return modelAndView; 
	}

	// 게임 정보 리스트
	public ModelAndView selectList(Pager pager, GameSearchInfo gameSearchInfo) throws Exception {

		int totalRow = gameDAO.getTotalRow(gameSearchInfo); // 게임 정보의 총 갯수
		System.out.println("totalRow: " + totalRow);
		
		// 페이징 처리
		pager.setTotalRow(totalRow);
		pager.setPerPage(12);
		pager.paging();
		
		List<GameDTO> gameDTOs = gameDAO.selectList(pager, gameSearchInfo); // 게임 정보 리스트 가져오기
		
		// 세일 상태 확인
		Timestamp curDate = gameDAO.getCurDate(); // 현재날짜
		for (GameDTO gameDTO : gameDTOs) {
			this.gameSaleCheck(gameDTO, curDate);
		}

		// 데이터 저장
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("games", gameDTOs); // 게임 리스트 저장
		modelAndView.addObject("searchInfo", gameSearchInfo);
		modelAndView.setViewName("game/gameList"); // forward할 주소
		return modelAndView;
	}

	// 게임 정보 등록
	public String gameInsert(HttpSession session, RedirectAttributes redirectAttributes,
			GameDTO gameDTO, MultipartFile mainImg, List<MultipartFile> subImgs) throws Exception {
		
		
		String message = "게임 등록에 실패 하였습니다."; // alert 메시지
		String addr = "redirect:./gameInsert"; // redirect할 주소
		
		// DB에 게임 정보 입력
		gameDTO.setDowncnt(new Random().nextInt(1000000));
		int result = gameDAO.insert(gameDTO);
		
		if (result > 0) { // DB에 게임 정보 입력 성공하였다면

			// DB에 이미지 정보 입력, 서버에 이미지 업로드
			
			// GameFileDTO 생성, 기본 정보 대입
			GameFileDTO gameFileDTO = new GameFileDTO();
			gameFileDTO.setG_num(gameDTO.getG_num());
			
			// 메인 이미지 DB에 입력, 서버에 업로드
			gameFileDTO.setKind("main");
			String path = session.getServletContext().getRealPath("resources/upload/images/game/main");
			if (mainImg.getOriginalFilename() != "") { // 선택한 메인 이미지 업로드
				result *= this.fileUpload(mainImg, gameFileDTO, path);
			} else { // 메인 이미지를 선택하지 않았다면
				gameFileDTO.setOname("defaultMainImg.jpg");
				gameFileDTO.setFname("defaultMainImg.jpg");
				result *= gameFileDAO.insert(gameFileDTO);
			}
			
			// 서브 이미지 업로드, 이미지 정보 DB에 입력
			gameFileDTO.setKind("sub");
			path = session.getServletContext().getRealPath("resources/upload/images/game/sub");
			for (MultipartFile file : subImgs) {
				result *= this.fileUpload(file, gameFileDTO, path);
			}
			
			// 이미지 업로드, DB에 입력 성공하였다면
			if (result > 0) {
				message = "게임이 등록 되었습니다.";
				addr = "redirect:./gameView?g_num=" + gameFileDTO.getG_num();
			}
		}
		
		redirectAttributes.addFlashAttribute("message", message);

		return addr;
	}
	
	// ---------------- 서브 메서드 ----------------
	
	// 파일 한개 업로드, DB에 저장
	public int fileUpload(MultipartFile file, GameFileDTO gameFileDTO, String path) throws Exception {
		int result = 1;
		if(file.getOriginalFilename() != "") {
			FileDTO fileDTO = fileUploader.upload(file, path); // 파일업로드 및 fname과 oname을 가져오기
			gameFileDTO.setOname(fileDTO.getOname()); // DTO에 fname 대입
			gameFileDTO.setFname(fileDTO.getFname()); // DTO에 oname 대입
			result =  gameFileDAO.insert(gameFileDTO); // DTO의 데이터를 DB에 저장
		}
		return result;
	}
	
	// 세일 상태 확인
	public void gamesSaleCheck(List<GameDTO> gameDTOs, Timestamp curDate) {
		for (GameDTO gameDTO : gameDTOs) {
			this.gameSaleCheck(gameDTO, curDate);
		}
	}
	
	// 세일 상태 확인
	public void gameSaleCheck(GameDTO gameDTO, Timestamp curDate) {
		gameDTO.setSaleStatus("0");
		if (gameDTO.getSale() != null && gameDTO.getSale() > 0
				&& gameDTO.getSaleStartDate() != null && gameDTO.getSaleEndDate() != null) {
			if(curDate.before(gameDTO.getSaleStartDate())) {
			} else if (curDate.after(gameDTO.getSaleEndDate())) {
				gameDAO.gameCancelSale(gameDTO.getG_num());
			} else {
				gameDTO.setSaleStatus("1");
			}
		}
	}
	
}
