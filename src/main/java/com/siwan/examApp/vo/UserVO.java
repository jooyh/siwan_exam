package com.siwan.examApp.vo;

public class UserVO {

	private String userId;
	private String userPw;
	private String userLvl;
	private String userName;
	private String regDtm;
	private String updDtm;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserLvl() {
		return userLvl;
	}
	public void setUserLvl(String userLvl) {
		this.userLvl = userLvl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRegDtm() {
		return regDtm;
	}
	public void setRegDtm(String regDtm) {
		this.regDtm = regDtm;
	}
	public String getUpdDtm() {
		return updDtm;
	}
	public void setUpdDtm(String updDtm) {
		this.updDtm = updDtm;
	}
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userLvl=" + userLvl + ", userName=" + userName
				+ ", regDtm=" + regDtm + ", updDtm=" + updDtm + "]";
	}

}
