<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/professorEnroll.do" method="post">
	Subject<br>
	ID : <input type="text" name="id" /> 교과목번호 <br>
	TITLE : <input type="text" name="title" /> 강의명<br>
	# of Student : <input type="text" name="count" /> 학생수<br>
	<input type="submit" value="Enroll" /><br>
	</form>
</body>
</html>