package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.Service;
import com.dev.vo.VO;

public class ProfessorEnrollController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		int count = Integer.parseInt(request.getParameter("count"));
		
		VO subject = new VO();
		subject.setId(id);
		subject.setTitle(title);
		subject.setCount(count);
		
		Service service = Service.getInstance();
		service.pjoin(subject);
		
		HttpUtil.forward(request, response, "/result/professorEnrollOutput.jsp");
	}

	
}
