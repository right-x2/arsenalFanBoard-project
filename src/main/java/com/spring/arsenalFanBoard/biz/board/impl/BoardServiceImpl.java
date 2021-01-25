package com.spring.arsenalFanBoard.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.arsenalFanBoard.biz.board.BoardService;
import com.spring.arsenalFanBoard.biz.board.BoardVO;
import com.spring.arsenalFanBoard.biz.user.UserVO;
import com.spring.arsenalFanBoard.biz.user.impl.UserDAO;



@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	@Autowired
	private UserDAO userDAO;

	
	
	public void insertBoard(BoardVO vo, UserVO user) {
		boardDAO.insertBoard(vo);
		userDAO.updateUserPoint(user);
	}
	public void updateBoard(BoardVO vo) {

		boardDAO.updateBoard(vo);
	}
	public void deleteBoard(BoardVO vo) {

		boardDAO.deleteBoard(vo);
	}
	public BoardVO getBoard(BoardVO vo) {

		return boardDAO.getBoard(vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo){

		return boardDAO.getBoardList(vo);
	}
	
	public List<BoardVO> getUserBoardList(UserVO vo){

		return boardDAO.getUserBoardList(vo);
	}
}