package com.spring.arsenalFanBoard.biz.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import com.spring.arsenalFanBoard.SqlSessionFactoryBean;
import com.spring.arsenalFanBoard.biz.user.UserVO;


@Repository("UserDAO")
public class UserDAO {

	private SqlSession mybatis;
	public UserDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertUser(UserVO vo) {
		mybatis.insert("UserDAO.insertUser",vo);
		mybatis.commit();
	}
	
	
	public void updateUser(UserVO vo) {
		mybatis.update("UserDAO.updateUser",vo);
		mybatis.commit();
	}
	
	public void updateUserPoint(UserVO vo) {
		mybatis.update("UserDAO.updateUserPoint",vo);
		mybatis.commit();
	}
	
	public void deleteUser(UserVO vo) {
		mybatis.delete("UserDAO.deleteUser",vo);
		mybatis.commit();
	}
	
	
	public UserVO getUser(UserVO vo) {
		return (UserVO)mybatis.selectOne("UserDAO.getUser",vo);
	}
	
	public UserVO getUserInfo(UserVO vo) {
		return (UserVO)mybatis.selectOne("UserDAO.getUserInfo",vo);
	}
	
	
}
