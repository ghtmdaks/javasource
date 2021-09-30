package com.hot.orders;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hot.game.GameDTO;

@Repository
public class OrdersDAO {
	
	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE = "ordersMapper.";
	
	public int ordersPayment(ArrayList<Integer> o_nums) throws Exception {
		return sqlSession.update(NAMESPACE + "ordersPayment", o_nums);
	}
	
	public int ordersTotalRow(OrdersDTO ordersDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "ordersTotalRow", ordersDTO);
	}
	
	public List<GameDTO> ordersList(OrdersDTO ordersDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE + "ordersList", ordersDTO);
	}
	
	public int ordersDelete(OrdersDTO ordersDTO) throws Exception {
		System.out.println(ordersDTO.getO_num() + "왔네?");
		return sqlSession.delete(NAMESPACE + "ordersDelete", ordersDTO);
	}
	
	public OrdersDTO ordersSelectOne(OrdersDTO ordersDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "ordersSelectOne", ordersDTO);
	}
	
	public int ordersInsert(OrdersDTO ordersDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "ordersInsert", ordersDTO);
	}
	
}
