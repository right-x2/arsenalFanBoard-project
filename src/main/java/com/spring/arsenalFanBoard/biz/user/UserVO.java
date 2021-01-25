package com.spring.arsenalFanBoard.biz.user;

import java.sql.Date;

public class UserVO {
	private String id;
	private String password;
	private String userName;
	private String nickName;
	private String email;
	private Date signUpdate;
	private int point;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String mickName) {
		this.nickName = mickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getSignUpDate() {
		return signUpdate;
	}
	public void setSignUpDate(Date signUpDate) {
		this.signUpdate = signUpDate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", userName=" + userName + ", mickName=" + nickName
				+ ", email=" + email + ", signUpDate=" + signUpdate + ", point=" + point + "]";
	}
	
}
