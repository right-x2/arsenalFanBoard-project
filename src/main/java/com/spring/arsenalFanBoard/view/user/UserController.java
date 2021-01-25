package com.spring.arsenalFanBoard.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.arsenalFanBoard.biz.user.UserService;
import com.spring.arsenalFanBoard.biz.user.UserVO;
import com.spring.arsenalFanBoard.biz.user.impl.UserDAO;

@Controller
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String loginView(UserVO vo) {
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO,HttpSession session) {
		UserVO user = userDAO.getUser(vo);
		System.out.println(vo.getId()+"------"+vo.getPassword());
		if(userDAO.getUser(vo)!=null) {
			session.setAttribute("nickName", user.getNickName());
			session.setAttribute("id", user.getId());
			return "getBoardList.do";
		}
		else return "login.jsp";
	}
	
	@RequestMapping(value="/logout.do",method=RequestMethod.GET)
	public String logout(UserVO vo,HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
	
	@RequestMapping(value="/signup.do",method=RequestMethod.GET)
	public String siginupView(UserVO vo) {
		return "signup.jsp";
	}
	
	@RequestMapping(value="/signup.do",method=RequestMethod.POST)
	public String siginup(UserVO vo) {
		userService.insertUser(vo);
		System.out.println("---------회원가입 완료");
		return "login.jsp";
	}
	
	@RequestMapping(value="/userInfo.do",method=RequestMethod.GET)
	public String userInfo(Model model,HttpSession session) {
		UserVO user = new UserVO();
		String nickName = session.getAttribute("nickName").toString();
		System.out.println("---------"+nickName);
		user.setNickName(nickName);
		model.addAttribute("user", userService.getUserInfo(user));
		return "userInfo.jsp";
	}
	
	
	@RequestMapping(value="/userUpdate.do",method=RequestMethod.POST)
	public String userUpdate(UserVO vo,HttpSession session) {
		System.out.println(vo.getId()+"----------");
		userService.updateUser(vo);
		return "getBoardList.do";
	}
}
