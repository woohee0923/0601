package com.dev.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.Service;
import com.dev.vo.VO;

public class ProfessorShowController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service service = Service.getInstance();
		ArrayList<VO> list = service.pListAll();
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, response, "/result/professorListOutput.jsp");
	}

}
