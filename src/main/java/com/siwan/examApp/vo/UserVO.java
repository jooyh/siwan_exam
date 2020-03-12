package com.siwan.examApp.vo;

import java.util.List;

public class UserVO {

	private String name;
	private String age;
	private String gender;
	private String birth;
	private String userLvl;
	private List<UserVO> userVOList;

	public String getUserLvl() {
		return userLvl;
	}
	public void setUserLvl(String userLvl) {
		this.userLvl = userLvl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public List<UserVO> getUserVOList() {
		return userVOList;
	}
	public void setUserVOList(List<UserVO> userVOList) {
		this.userVOList = userVOList;
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + ", gender=" + gender + ", birth=" + birth + ", userLvl="
				+ userLvl + ", userVOList=" + userVOList + "]";
	}


}
