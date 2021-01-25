package com.spring.arsenalFanBoard.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.arsenalFanBoard.SqlSessionFactoryBean;
import com.spring.arsenalFanBoard.biz.board.BoardVO;
import com.spring.arsenalFanBoard.biz.user.UserVO;


@Repository("BoardDAO")
public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println("-------------->"+vo.getWriter());
		mybatis.insert("BoardDAO.insertBoard",vo);
		mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard",vo);
		mybatis.commit();
	}
	
	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard",vo);
		mybatis.commit();
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard",vo);
		
	}
	
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList",vo);
	}
	
	public List<BoardVO> getUserBoardList(UserVO vo){
		return mybatis.selectList("BoardDAO.getUserBoardList",vo);
	}
}