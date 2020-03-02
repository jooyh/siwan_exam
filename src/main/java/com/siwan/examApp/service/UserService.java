package com.siwan.examApp.service;

import java.util.List;

import com.siwan.examApp.vo.UserVO;

public interface UserService {

	/**
	 * 사용자 목록조회
	 * @return
	 */
	public List selectUserList();

	/**
	 * 사용자 상세정보조회
	 * @return
	 */
	public UserVO selectUserDetail(String userId);


}
