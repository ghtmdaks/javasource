package com.hot.gs;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test extends AbstractApplicationContextTest {
	
	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void test1() {
		assertNotNull(sqlSession);
	}

}
