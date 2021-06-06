<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/professorShow.do" method="post">
	Subject<br>
	ID : <input type="text" name="id" /><br>
	<input type="submit" value="Search" /><br>
	<%
		String list = (String)request.getAttribute("list");
		if(list == null)
		{
	%>
			${tId } : ${tTitle }
			<form action="/studentEnroll.do" method="post">
			<input type="submit" value="Enroll" /><br>
	<% 	}else{
			out.print(list);
		}
	%>
	<a href="menu.jsp">menu</a><br>
	</form>
</body>
</html>