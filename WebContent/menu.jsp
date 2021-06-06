<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String result = null;
	result = request.getParameter("person");
	if(result == "professor")
	{	
	%>
	교수:메뉴<br>
	<a href="professorEnroll.jsp">강의 등록</a><br> 
	<a href="professorShow.do">등록된 강의 리스트</a><br>
	<% }else {%>
	학생:메뉴<br>
	<a href="studentSearch.jsp">수강신청 및 수강취소</a><br> 
	<a href="stdentShow.do">수강신청 리스트</a><br> 
	<% } %>
	<a href="index.jsp">로그아웃</a><br>
</body>
</html>