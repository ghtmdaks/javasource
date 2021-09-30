package com.hot.member.file;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hot.member.MemberDTO;

@Repository
public class MemberFileDAO {

		@Inject
		private SqlSession sqlSession;
		private final String namespace = "memberFileMapper.";
		
		// 게엠 이미지 등록
		public int insert(MemberFileDTO memberFileDTO) throws Exception {
			System.out.println("memberFileDAO - insert");
			return sqlSession.insert(namespace + "insert", memberFileDTO);
		}
		
		public MemberFileDTO selectOne(MemberDTO memberDTO) throws Exception {
			return sqlSession.selectOne(namespace + "selectOne", memberDTO);
		}
		
		public MemberFileDTO selimg(String email) throws Exception {
			return sqlSession.selectOne(namespace+"selimg", email);
		}
		
		public int imgUpdate(MemberFileDTO newMemberFileDTO) throws Exception {
			return sqlSession.update(namespace+"imgUpdate", newMemberFileDTO);
		}
		
		
}
