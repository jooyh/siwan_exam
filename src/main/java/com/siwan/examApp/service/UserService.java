package com.siwan.examApp.service;

import java.util.List;

import com.siwan.examApp.vo.UserVO;

public interface UserService {

	/**
	 * ����� �����ȸ
	 * @return
	 */
	public List selectUserList();

	/**
	 * ����� ��������ȸ
	 * @return
	 */
	public UserVO selectUserDetail(String userId);


}
