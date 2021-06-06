<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	YongIn LMS<br>
	<form action="menu.jsp" method="post">
		ID : <input type="text" name="id"><br>
		PASSWORD : <input type="password" name="pwd"><br>
		<input type='radio' name="person" value="professor" checked/>Professor
  		<input type='radio' name="person" value="student" />Student<br>
		<input type="submit" value="Login">
	</form>
</body>
</html>