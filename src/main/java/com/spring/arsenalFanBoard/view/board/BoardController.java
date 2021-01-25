package com.spring.arsenalFanBoard.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.spring.arsenalFanBoard.biz.answer.AnswerService;
import com.spring.arsenalFanBoard.biz.board.BoardService;
import com.spring.arsenalFanBoard.biz.board.BoardVO;
import com.spring.arsenalFanBoard.biz.user.UserVO;



@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private AnswerService answerService;
	
	@Autowired
	private BoardService boardService;


	
	//湲� 紐⑸줉 蹂��솚 泥섎━ �슂泥�


	

	@RequestMapping(value="/insertBoard.do")
	public String insertBoard (BoardVO vo,HttpSession session) throws IOException{
		UserVO user = new UserVO();
		user.setId(session.getAttribute("id").toString());
		boardService.insertBoard(vo,user);
		return "getBoardList.do";
		
	}
	
	
		@RequestMapping(value="/updateBoard.do")
		public String updateBoard(@ModelAttribute("board")BoardVO vo) {
			boardService.updateBoard(vo);
			return "getBoardList.do";
		}

	
		@RequestMapping(value="/deleteBoard.do")
		public String deleteBoard(BoardVO vo) {

			boardService.deleteBoard(vo);
			return "getBoardList.do";
		}
		


	
		@RequestMapping("/getBoard.do")
		public String getBoard(BoardVO vo,Model model,HttpSession session) {
			//System.out.println(vo.getSeq()+"--------"+session.getAttribute("boardseq").toString()+"---------");
			/*
			if(vo.getSeq()==0){
				vo.setSeq(Integer.parseInt(session.getAttribute("boardseq").toString()));
			}
			*/
		 	model.addAttribute("board",boardService.getBoard(vo));
		 	model.addAttribute("answerList",answerService.getAnswerList(vo));
		 	session.setAttribute("boardSeq", vo.getSeq());
			return "getBoard.jsp";
		}
		
		
		@ModelAttribute("conditionMap")
		public Map<String,String> searchConditionMap(){
				Map<String,String> conditionMap = new HashMap<String, String>();
				conditionMap.put("�젣紐�","TITLE");
				conditionMap.put("�궡�슜","CONTENT");
				return conditionMap;
		}

	
	
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		model.addAttribute("boardList",boardService.getBoardList(vo));
		return "home.jsp";
	}
	
	
	@RequestMapping(value="/getUserBoardList.do")
	public String getUserBoardList(HttpSession session, Model mav) {
		UserVO user = new UserVO();
		user.setNickName(session.getAttribute("nickName").toString());
		mav.addAttribute("boardList",boardService.getUserBoardList(user));
		return "userBoardList.jsp";
	}
}