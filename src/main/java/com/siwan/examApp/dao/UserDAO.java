package com.siwan.examApp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.siwan.examApp.vo.UserVO;

@Repository
public interface UserDAO {

	public List<UserVO> selectUserList(UserVO vo);

}
