package com.hot.review;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.hot.util.page.Pager;

@Service
public class ReviewService {

	@Inject
	private ReviewDAO reviewDAO;
	
	// 리플 업데이트
	public int reviewReply(ReviewDTO reviewDTO) {
		// 1.step +1 > ref가 부모의 ref와 같고, step이 부모의 step보다 큰 것들을 찾아서 +1
		System.out.println(reviewDTO.getR_num());
		ReviewDTO reviewDTO2 = (ReviewDTO) reviewDAO.reviewOne(reviewDTO.getR_num());
		System.out.println("reviewReplyservice");
		reviewDAO.reviewReplyUpdate(reviewDTO2);
		// 2.ref = 부모의 ref step = 부모의 step+1 / depth = 부모의 depth+1
		reviewDTO.setRef(reviewDTO2.getRef());
		reviewDTO.setStep(reviewDTO2.getStep()+1);
		reviewDTO.setDepth(reviewDTO2.getDepth()+1);
		System.out.println(reviewDTO2.getRef()+"        reviewService");
		System.out.println(reviewDTO.getStep()+"        reviewService");
		System.out.println(reviewDTO.getDepth()+"        reviewService");
		return reviewDAO.reviewReply(reviewDTO);
	}
	
	
	// 리뷰 쓰기
	public int reviewWrite(ReviewDTO reviewDTO) {
		return reviewDAO.reviewWrite(reviewDTO);
	}

	// 글 리스트
	public ModelAndView reviewList(Pager pager, int g_num) {
		int rowCount = reviewDAO.getTotalRow(g_num);
		pager.setTotalRow(rowCount);
		pager.setPerPage(10);
		pager.paging();
		List<ReviewDTO> reviewList = reviewDAO.reviewList(g_num, pager);
		System.out.println(pager.getTotalRow()+"totalrow");
		System.out.println(pager.getCurPage()+"curpage");
		System.out.println(pager.getStartRow()+"startrow");
		System.out.println(pager.getEndRow()+"endrow");
		System.out.println(pager.getTotalPage()+"totalpage");
		
		for (ReviewDTO reviewDTO : reviewList) {
			System.out.println(reviewDTO.getR_num());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("reviewList", reviewList);
		return modelAndView;
	}

	// 글 하나보기
	public ModelAndView reviewOne(int r_num) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("review",  reviewDAO.reviewOne(r_num));
		mv.setViewName("review/reviewUpdate");
		return mv;
	}

	// 글 삭제
	public int reviewDelete(ReviewDTO reviewDTO) {
		System.out.println(reviewDTO.getContents() + "         UPDATEDeleteSERVICE");
		System.out.println(reviewDTO.getEmail() + "         UPDATEDeleteSERVICE");
		System.out.println(reviewDTO.getR_num() + "         UPDATEDeleteSERVICE");
		return reviewDAO.reviewDelete(reviewDTO);
	}

	// 글 수정
	public int reviewUpdate(ReviewDTO reviewDTO) {
		System.out.println(reviewDTO.getContents() + "         updateservice");
		System.out.println(reviewDTO.getEmail() + "         updateservice");
		System.out.println(reviewDTO.getR_num() + "         updateservice");
		return reviewDAO.reviewUpdate(reviewDTO);
	}

}
