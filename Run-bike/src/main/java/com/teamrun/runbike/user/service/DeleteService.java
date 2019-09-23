package com.teamrun.runbike.user.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamrun.runbike.user.dao.UserDao;
import com.teamrun.runbike.user.domain.LoginInfo;
import com.teamrun.runbike.user.domain.UserInfo;

@Service("deleteService")
public class DeleteService {
	@Autowired
	private SqlSessionTemplate template;
	
	private UserDao dao;
	
	public int userDelete(HttpServletRequest request, String pw) {
		int result = 0;
		dao = template.getMapper(UserDao.class);
		
		LoginInfo loginInfo = (LoginInfo)request.getSession(false).getAttribute("loginInfo");
		UserInfo userInfo = dao.selectUserById(loginInfo.getU_id());
		
		if(userInfo !=null && userInfo.checkPW(pw)) {
			result = dao.chkLeave(userInfo.getU_idx());
			request.getSession(false).invalidate();
		}
				
		return result;
	}
}
