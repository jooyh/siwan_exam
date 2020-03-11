package com.siwan.examApp.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.siwan.examApp.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "main";
	}

	@RequestMapping("/testSubmit")
	@ResponseBody
	/*
	 * @RequestBody�� �����͸� ���޹�������
	 * contentType�� "application/json" ���� ����
	 */
	public UserVO test(Model model , @RequestBody UserVO userVO){
		for(UserVO vo : userVO.getUserVOList()) {
			logger.info(vo.toString());
		}
		return userVO;
	}

}
