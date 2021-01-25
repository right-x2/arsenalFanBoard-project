package com.spring.arsenalFanBoard.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.arsenalFanBoard.biz.user.UserService;
import com.spring.arsenalFanBoard.biz.user.UserVO;



@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
	@Override
	public UserVO getUserInfo(UserVO vo) {
		return userDAO.getUserInfo(vo);
	}
	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}
	@Override
	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
		
	}
	@Override
	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);
		
	}

}