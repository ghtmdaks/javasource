package com.hot.orders;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.hot.game.GameDAO;
import com.hot.game.GameDTO;

@Service
@Transactional
public class OrdersService {
	
	@Inject
	private OrdersDAO ordersDAO;
	@Inject
	private GameDAO gameDAO;
	
	public int ordersPayment(ArrayList<Integer> o_nums, ArrayList<Integer> g_nums) throws Exception {
		ordersDAO.ordersPayment(o_nums);
		return gameDAO.downCntUpdate(g_nums);
	}
	
	public ModelAndView myCartList(OrdersDTO ordersDTO) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		
		ordersDTO.setStatus(0);
		
		List<GameDTO> ordersList = ordersDAO.ordersList(ordersDTO);
		
		Timestamp curDate = gameDAO.getCurDate();
		this.gamesSaleCheck(ordersList, curDate);
		
		double totalPrice = 0;
		for (GameDTO gameDTO : ordersList) {
			double price = gameDTO.getPrice();
			System.out.println(price);
			if(gameDTO.getSaleStatus().equals("1")) {
//				price = Math.floor(price * (100 - gameDTO.getSale()))/100;
				price = price * (100 - gameDTO.getSale()) / 100;
			}
			totalPrice += price;
		}
		
		modelAndView.addObject("ordersList", ordersList);
		modelAndView.addObject("totalPrice", totalPrice);
		modelAndView.setViewName("member/myCart");
		
		return modelAndView;
	}
	
	public ModelAndView myGameList(OrdersDTO ordersDTO) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		ordersDTO.setStatus(1);
		
		List<GameDTO> gameList = ordersDAO.ordersList(ordersDTO);
		
		modelAndView.addObject("gameList", gameList);
		modelAndView.setViewName("member/myGame");
		
		return modelAndView;
	}
	
	public int deleteFromCart(OrdersDTO ordersDTO) throws Exception {
		System.out.println(ordersDTO.getO_num() + "계심?");
		return ordersDAO.ordersDelete(ordersDTO);
	}
	
	public String ordersDelete(OrdersDTO ordersDTO) throws Exception {
		String message = "장바구니에 없는 게임입니다.";
		OrdersDTO ordersCheck = ordersDAO.ordersSelectOne(ordersDTO);
		if(ordersCheck != null) {
			if(ordersCheck.getStatus() == 0) {
				int result = ordersDAO.ordersDelete(ordersDTO);
				if(result > 0) {
					message = "장바구니에서 삭제 되였습니다.";
				} else {
					message = "장바구니에서 삭제 실패하였습니다.";
				}
			} else {
				message = "이미 구매한 게임입니다.";
			}
		}
		return message;
	}
	
	public String ordersInsert(OrdersDTO ordersDTO) throws Exception {

		String message = "이미 구매하거나 장바구니에 담긴 게임입니다.";
		OrdersDTO ordersCheck = ordersDAO.ordersSelectOne(ordersDTO);
		if (ordersCheck == null) {
			ordersDTO.setStatus(0);
			int ordersTotalRow = ordersDAO.ordersTotalRow(ordersDTO);
			if (ordersTotalRow < 10) {
				int result = ordersDAO.ordersInsert(ordersDTO);
				if (result > 0) {
					message = "장바구니에 담겼습니다.";
				} else {
					message = "장바구니에 담지 못 하였습니다.";
				}
			} else {
				message = "장바구니에 최대 10개의 게임을 담을 수 있습니다.";
			}
		}
		return message;
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
