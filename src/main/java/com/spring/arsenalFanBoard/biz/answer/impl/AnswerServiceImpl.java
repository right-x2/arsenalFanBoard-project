package com.spring.arsenalFanBoard.biz.answer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.arsenalFanBoard.biz.answer.AnswerService;
import com.spring.arsenalFanBoard.biz.answer.AnswerVO;
import com.spring.arsenalFanBoard.biz.board.BoardVO;
import com.spring.arsenalFanBoard.biz.board.impl.BoardDAO;
import com.spring.arsenalFanBoard.biz.user.UserVO;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerDAO answerDAO;
	
	@Override
	public void insertAnswer(AnswerVO vo) {
		answerDAO.insertAnswer(vo);
		
	}

	@Override
	public void updateAnswer(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAnswer(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO getAnswer(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnswerVO> getAnswerList(BoardVO vo) {
		
		return answerDAO.getAnswerList(vo);
	}

}
