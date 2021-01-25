package com.spring.arsenalFanBoard.biz.answer.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.arsenalFanBoard.SqlSessionFactoryBean;
import com.spring.arsenalFanBoard.biz.answer.AnswerVO;
import com.spring.arsenalFanBoard.biz.board.BoardVO;

@Repository("AnswerDAO")
public class AnswerDAO {
	
	private SqlSession mybatis;
	
	public AnswerDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertAnswer(AnswerVO vo) {
		mybatis.insert("AnswerDAO.insertAnswer",vo);
		mybatis.commit();
	}
	
	public List<AnswerVO> getAnswerList(BoardVO vo) {
		System.out.println(vo.getSeq());
		return mybatis.selectList("AnswerDAO.getAnswerList",vo);
	}
}
