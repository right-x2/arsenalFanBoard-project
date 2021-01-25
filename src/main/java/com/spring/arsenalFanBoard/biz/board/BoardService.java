package com.spring.arsenalFanBoard.biz.board;

import java.util.List;

import com.spring.arsenalFanBoard.biz.user.UserVO;

public interface BoardService {
		
	void insertBoard(BoardVO vo, UserVO user);
	
	void updateBoard(BoardVO vo);
	
	void deleteBoard(BoardVO vo);
	
	BoardVO getBoard(BoardVO vo);
	
	List<BoardVO> getBoardList(BoardVO vo);
	
	List<BoardVO> getUserBoardList(UserVO vo);

}
