package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.Service;
import com.dev.vo.VO;

public class StudentEnrollController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		
		VO subject = new VO();
		subject.setId(id);
		subject.setTitle(title);
		
		Service service = Service.getInstance();
		service.sjoin(subject);
		
		HttpUtil.forward(request, response, "/result/studentEnrollOutput.jsp");
	
	}

}
