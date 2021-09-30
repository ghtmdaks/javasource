package com.hot.member;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	private String namespace="memberMapper.";

	public MemberDTO selectOne(String email) throws Exception {
		System.out.println("안오슈? MEMBERDAO - SELECT ONE");
		return sqlSession.selectOne(namespace+"dd", email);
	}
	
	public int insert(MemberDTO memberDTO)  {
		return sqlSession.insert(namespace + "insert", memberDTO);
	}
	
	public int nickchk(String nickname) throws Exception {
		return sqlSession.selectOne(namespace+"nickchk", nickname);
	}
	
	public int chk(String email) throws Exception {
		return sqlSession.selectOne(namespace+"chk", email);
	}
	

	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(namespace+"memberLogin", memberDTO);
	}
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(namespace+"memberJoin", memberDTO);
	}
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		return sqlSession.update(namespace+"memberUpdate", memberDTO);
	}
	
	
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return sqlSession.delete(namespace+"memberDelete", memberDTO);			
	}
	
	public int memberPwUpdate(MemberDTO memberDTO) {
		return sqlSession.update(namespace+"memberPwUpdate", memberDTO);
	}
	
	
}
