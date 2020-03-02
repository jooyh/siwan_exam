package com.siwan.examApp.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siwan.examApp.dao.UserDAO;
import com.siwan.examApp.service.UserService;
import com.siwan.examApp.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	private static final String NAME_SPACE = "com.siwan.examApp.dao.UserDAO.";

//	@Autowired
//	private SqlSession sqlSession;

	@Autowired
	private UserDAO userDao;

	public List selectUserList() {
//		List<UserVO> userList = sqlSession.selectList(NAME_SPACE+"selectUserList");
		List<UserVO> userList = userDao.selectUserList();
		System.out.println(userList.toString());
		return null;
	}

	public UserVO selectUserDetail(String userId) {
		return null;
	}

}
