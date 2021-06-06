package com.dev.service;

import java.util.ArrayList;
import com.dev.dao.Dao;
import com.dev.vo.VO;

public class Service {

	private static Service service = new Service();
	public Dao dao = Dao.getInstance();
	private Service() {}
	
	public static Service getInstance()
	{
		return service;
	}
	public void pjoin(VO subject) {
		// TODO Auto-generated method stub
		dao.pjoin(subject);
	}
	public ArrayList<VO> pListAll() {
		// TODO Auto-generated method stub
		return dao.pListAll();
	}
	public VO Search(String id) {
		// TODO Auto-generated method stub
		VO subject = dao.Search(id);
		return subject;
	}
	public void sjoin(VO subject) {
		// TODO Auto-generated method stub
		dao.sjoin(subject);
	}
	public ArrayList<VO> sListAll() {
		// TODO Auto-generated method stub
		return dao.sListAll();
	}
}
