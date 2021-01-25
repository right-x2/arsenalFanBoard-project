package com.spring.arsenalFanBoard.biz.answer;

import java.util.List;

import com.spring.arsenalFanBoard.biz.board.BoardVO;
import com.spring.arsenalFanBoard.biz.user.UserVO;



public interface AnswerService {
	void insertAnswer(AnswerVO vo);
	
	void updateAnswer(BoardVO vo);
	
	void deleteAnswer(BoardVO vo);
	
	BoardVO getAnswer(BoardVO vo);
	
	List<AnswerVO> getAnswerList(BoardVO vo);
}
