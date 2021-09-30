package com.hot.gs;

import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hot.orders.OrdersDTO;
import com.hot.orders.OrdersService;

@Controller
@RequestMapping(value = "/orders/")
public class OrdersController {
	
	@Inject
	private OrdersService ordersService;
	
	@RequestMapping(value = "ordersPayment", method = RequestMethod.POST)
	@ResponseBody
	public int ordersPayment(String o_num, String g_num) throws Exception {
		
		StringTokenizer oNumTokenizer = new StringTokenizer(o_num, ",");
		StringTokenizer gNumTokenizer = new StringTokenizer(g_num, ",");
		
		ArrayList<Integer> o_nums = new ArrayList<Integer>();
		ArrayList<Integer> g_nums = new ArrayList<Integer>();
		
		while (oNumTokenizer.hasMoreTokens()) {
			o_nums.add(Integer.parseInt(oNumTokenizer.nextToken()));
		}
		while (gNumTokenizer.hasMoreElements()) {
			g_nums.add(Integer.parseInt(gNumTokenizer.nextToken()));
		}
		
		return ordersService.ordersPayment(o_nums, g_nums);
	}
	
	// 장바구니에서 삭제
	@RequestMapping(value = "deleteFromCart", method = RequestMethod.POST)
	@ResponseBody
	public int deleteFromCart(OrdersDTO ordersDTO) throws Exception {
		System.out.println(ordersDTO.getO_num() + "계세요?");
		return ordersService.deleteFromCart(ordersDTO);
	}
	
	// 장바구니에서 삭제
	@RequestMapping(value = "ordersDelete", method = RequestMethod.POST)
	@ResponseBody
	public String ordersDelete(OrdersDTO ordersDTO) throws Exception {
		return ordersService.ordersDelete(ordersDTO);
	}
	
	// 장바구니에 담기
	@RequestMapping(value = "ordersInsert", method = RequestMethod.POST)
	@ResponseBody
	public String ordersInsert(OrdersDTO ordersDTO) throws Exception {
		return ordersService.ordersInsert(ordersDTO);
	}

}
