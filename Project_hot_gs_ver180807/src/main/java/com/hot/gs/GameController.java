package com.hot.gs;


import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.game.GameDTO;
import com.hot.game.GameService;
import com.hot.game.file.GameFileDTO;
import com.hot.review.ReviewDTO;
import com.hot.review.ReviewService;
import com.hot.util.page.Pager;
import com.hot.util.page.GameSearchInfo;

@Controller
@RequestMapping(value = "/game/")
public class GameController {
	
	@Inject
	private GameService gameService;
	@Inject
	private ReviewService reviewService;
	
	// 게임 세일
	@RequestMapping(value = "gameSale", method = RequestMethod.POST)
	@ResponseBody
	public int gameSale (GameDTO gameDTO) {
		return gameService.gameSale(gameDTO); 
	}
		
	// 게임 세일 취소
	@RequestMapping(value = "gameCancelSale", method = RequestMethod.POST)
	@ResponseBody
	public String gameCancelSale (int g_num) {
		int result = gameService.gameCancelSale(g_num); 
		String message = "세일 왜 취소 않됨?!";
		if (result > 0) {
			message = "세일은 없는 일로다!!!!";
		}
		return message;
	}
	
	// 추천 게임에서 삭제
	@RequestMapping(value = "gameCancelRecommend", method = RequestMethod.POST)
	@ResponseBody
	public String gameCancelRecommend (int g_num) {
		int result = gameService.gameCancelRecommend(g_num);
		String message = "추천 게임에서 삭제 실패하였습니다.";
		if(result > 0) {
			message = "추천 게임에서 삭제 성공하였습니다.";
		}
		return message;
	}
	
	// 추천 게임으로 지정
	@RequestMapping(value = "gameRecommend", method = RequestMethod.POST)
	@ResponseBody
	public String gameRecommend (int g_num) {
		int result = gameService.gameRecommend(g_num);
		String message = "추천 게임으로 지정하지 못 하였습니다.";
		if(result > 0) {
			message = "추천 게임으로 지정 되였습니다.";
		}
		return message;
	}
	
	// 게임 정보 삭제
	@RequestMapping(value = "gameDelete", method = RequestMethod.POST)
	@ResponseBody
	public int delete(HttpSession session, int g_num) throws Exception {
		return gameService.delete(session, g_num);
	}
	
	// 게임 메인 이미지 변경
	@RequestMapping(value = "mainImgUpdate", method = RequestMethod.POST)
	public String mainImgUpdate(HttpSession session, RedirectAttributes redirectAttributes, MultipartFile mainImg, GameFileDTO gameFileDTO) throws Exception {
		return gameService.mainImgUpdate(session, redirectAttributes, mainImg, gameFileDTO);
		
	}
	
	// 게임 이미지 삭제
	@RequestMapping(value = "subImgDeleteWithFname", method = RequestMethod.POST)
	@ResponseBody
	public int subImgDeleteWithFname(HttpSession session, String fname) throws Exception {
		return gameService.subImgDeleteWithFname(session, fname);
	}
	
	// 게임 이미지 추가
	@RequestMapping(value = "imgsUpload", method = RequestMethod.POST)
	public String filesUpload(HttpSession session, RedirectAttributes redirectAttributes,
			List<MultipartFile> files, GameFileDTO gameFileDTO) throws Exception{
			return gameService.filesUpdate(session, redirectAttributes, files, gameFileDTO);
	}
	
	// 게임 이미지 관리
	@RequestMapping(value = "gameImgUpdate", method = RequestMethod.GET)
	public ModelAndView imgUpdate(int g_num) throws Exception {
		return gameService.gameImgUpdate(g_num);
	}
	
	// 게임 정보 수정 페이지 이동
	@RequestMapping(value = "gameInfoUpdate", method = RequestMethod.GET)
	public ModelAndView update(int g_num) throws Exception {
		return gameService.infoUpdate(g_num);
	}
	
	// 게임 정보 수정 - POST
	@RequestMapping(value = "gameInfoUpdate", method = RequestMethod.POST)
	public String update(RedirectAttributes redirectAttributes, GameDTO gameDTO, String[] genres) throws Exception {
		if (gameDTO.getGenre() == null) {
			StringBuilder genre = new StringBuilder();
			for (String string : genres) {
				genre.append(string);
				genre.append(", ");
			}
			genre.delete(genre.lastIndexOf(","), genre.lastIndexOf(" "));
			gameDTO.setGenre(genre.toString());
		}
		return gameService.infoUpdate(redirectAttributes, gameDTO);
	}
	
	// 게임 정보 보기
	@RequestMapping(value = "gameView", method = RequestMethod.GET)
	public ModelAndView view(HttpSession session, int g_num) throws Exception {
		return gameService.selectOne(session, g_num);
	}
	
	// 게임 정보 리스트
	@RequestMapping(value = "gameList", method = RequestMethod.GET)
	public ModelAndView list(Pager pager, GameSearchInfo gameSearchInfo, Timestamp timestamp) throws Exception {
		System.out.println("Timestamp: " + timestamp);
		return gameService.selectList(pager, gameSearchInfo);
	}
	
	// 게임 정보 등록 페이지 이동
	@RequestMapping(value = "gameInsert", method = RequestMethod.GET)
	public void gameInsert() throws Exception {}
	
	// 게임 정보 등록
	@RequestMapping(value = "gameInsert", method = RequestMethod.POST)
	public String gameInsert(HttpSession session, String[] genres, RedirectAttributes redirectAttributes,
				GameDTO gameDTO, MultipartFile mainImg, List<MultipartFile> subImgs) throws Exception {
		StringBuilder genre = new StringBuilder();
		for (String string : genres) {
			genre.append(string);
			genre.append(", ");
		}
		genre.delete(genre.lastIndexOf(","), genre.lastIndexOf(" "));
		System.out.println(genre.toString());
		gameDTO.setGenre(genre.toString());
		return gameService.gameInsert(session, redirectAttributes, gameDTO, mainImg, subImgs);
	}
	
	// 게임 정보 부분 끝 ----------------------------------------------------------------------------------------------
	
	// 리뷰부분 ------------------------------------------------------------------------------------------------------
	
	// 리뷰 리플라이
	@RequestMapping(value = "reviewReply", method = RequestMethod.POST)
	@ResponseBody
	public int reviewReplyPost(ReviewDTO reviewDTO) {
		return reviewService.reviewReply(reviewDTO);
	}

	// 리뷰 쓰기
	@RequestMapping(value = "reviewWrite", method = RequestMethod.POST)
	@ResponseBody
	public int reviewWrite(ReviewDTO reviewDTO) {
		return reviewService.reviewWrite(reviewDTO);
	}

	// 리뷰 리스트
	@RequestMapping(value = "reviewList", method = RequestMethod.POST)
	public ModelAndView reviceList(Pager pager, int g_num) {
		ModelAndView mv=reviewService.reviewList(pager, g_num);
		mv.setViewName("game/reviewMore");
		return mv;
	}
	
//	@RequestMapping(value = "reviewMore", method = RequestMethod.GET)
//	public String  reviceMore( int g_num, Model model) {
//		model.addAttribute("g_num",g_num);
//		return "game/gameView2";
//	}

	// 글 수정
	@RequestMapping(value = "reviewUpdate", method = RequestMethod.POST)
	@ResponseBody
	public int reviewUpdate(ReviewDTO reviewDTO, RedirectAttributes redirectAttributes) {
		return reviewService.reviewUpdate(reviewDTO);
	}

//	@RequestMapping(value = "reviewUpdate", method = RequestMethod.GET)
//	public ModelAndView reviewUpdate(int r_num) {
//		return reviewService.reviewOne(r_num);
//	}

	// 글 삭제
	@RequestMapping(value = "reviewDelete", method = RequestMethod.POST)
	@ResponseBody
	public int reviewDelete(ReviewDTO reviewDTO) {
		return reviewService.reviewDelete(reviewDTO);
		
	}

//	@RequestMapping(value = "reviewDelete", method = RequestMethod.GET)
//	public ModelAndView reviewDelete(int r_num) {
//		return reviewService.reviewOne(r_num);
//	}
	
}
