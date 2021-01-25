package com.spring.arsenalFanBoard.view.answer;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.arsenalFanBoard.biz.answer.AnswerService;
import com.spring.arsenalFanBoard.biz.answer.AnswerVO;
import com.spring.arsenalFanBoard.biz.board.BoardVO;
import com.spring.arsenalFanBoard.biz.user.UserVO;

@Controller
@SessionAttributes("answer")
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;
	

	

	@RequestMapping(value="/insertAnswer.do")
	public String insertBoard (AnswerVO answer,HttpSession session) throws IOException{
		answer.setBoardSeq(Integer.parseInt(session.getAttribute("boardSeq").toString()));
		answerService.insertAnswer(answer);
		return "getBoard.do?seq="+answer.getBoardSeq();
	}

}