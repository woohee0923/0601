package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dev.vo.VO;

public class Dao {

	private static Dao dao = new Dao();
	private Dao() {}
	public static Dao getInstance() {
		return dao;
	}
	
	public Connection connect() {
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prof", "root", "root");
		}catch(Exception e) {
			System.out.print("MDAO:connect"+e);
		}
		return conn;
	}
	
	public void close(Connection conn, PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try {
				pstmt.close();
			}catch(Exception e) {
				System.out.print("Pstmt close error" +e);
			}
		}
		if(conn != null)
		{
			try {
				conn.close();
			}catch(Exception e)
			{
				System.out.print("Conn close error"+e);
			}
		}
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs)
	{
		if(rs != null)
		{
			try {
				rs.close();
			}catch(Exception e) {
				System.out.print("rs close error" +e);
			}
		}
		close(conn,pstmt);
	}
	
	public void pjoin(VO subject) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("insert into subject values(?,?,?);");
			pstmt.setString(1, subject.getId());
			pstmt.setString(2, subject.getTitle());
			pstmt.setString(3, subject.getCount()+"");
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			System.out.print("Enroll error" + e);
		}
		finally
		{
			close(conn,pstmt);
		}
	}
	public ArrayList<VO> pListAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false;
		ArrayList<VO> list = new ArrayList<VO>();
		VO subject = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from subject;");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				result = true;
			}
		}catch(Exception e) {
			System.out.print("MSearch error"+e);
		}finally
		{
			close(conn,pstmt,rs);
		}
		return list;
	}
	public VO Search(String id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		VO subject = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from subject where id=?;");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				subject = new VO();
				subject.setId(rs.getString(1));
			}
		}catch(Exception e) {
			System.out.print("MSearch error"+e);
		}finally
		{
			close(conn,pstmt,rs);
		}
		return subject;
		
	}
	
	public void sjoin(VO subject) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("insert into enroll values(?,?);");
			pstmt.setString(1, subject.getId());
			pstmt.setString(2, subject.getTitle());
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			System.out.print("Enroll error" + e);
		}
		finally
		{
			close(conn,pstmt);
		}
	}
	public ArrayList<VO> sListAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false;
		ArrayList<VO> list = new ArrayList<VO>();
		VO subject = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from enroll where ? = ? and ? = ?;");
			pstmt.setString(1, subject.title);
			pstmt.setString(2, request.setAttribute("id"));
			pstmt.setString(3, request.setAttribute("title"));
			pstmt.setString(4, subject.id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				result = true;
			}
		}catch(Exception e) {
			System.out.print("MSearch error"+e);
		}finally
		{
			close(conn,pstmt,rs);
		}
		return list;
	}
}
