package com.spring.arsenalFanBoard.biz.user;


public interface UserService {
	
	public UserVO getUser(UserVO vo);
	
	public UserVO getUserInfo(UserVO vo);
	
	public void insertUser(UserVO vo);
	
	public void updateUser(UserVO vo);
	
	public void deleteUser(UserVO vo);
}
