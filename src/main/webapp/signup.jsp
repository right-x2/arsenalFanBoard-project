<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>singup</title>
</head>
<body>
<center>
	<h1>회원가입</h1>
	<hr>
		<form action="signup.do" method="post">
			아이디: <input type="text" name="id"><br>
			비밀번호: <input type="password" name="password"><br>
			이름: <input type="text" name="userName"><br>
			별멸: <input type="text" name="nickName"><br>
			이메일: <input type="text" name="email"><br>
			<input type="submit" value="회원가입"/>
		</form>
	<hr>
</center>
</body>
</html>