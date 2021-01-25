<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>UserInfo</title>
</head>
<body>
<form action="userUpdate.do"  method="post">
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td bgcolor="orange" width="70">ID</td><td align="left"><input type="text" name="id" value="${user.id }"/></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">비밀번호</td><td align="left"><input type="text" name="password" value="${user.password }"/></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">이름</td><td align="left">${user.userName }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">별명</td><td align="left"><input type="text" name="nickName" value="${user.nickName }"/></td>
		</tr>	
		<tr>
			<td bgcolor="orange" width="70">포인트</td><td align="left">${user.point }</td>
		</tr>	
	</table>	
	<input type="submit" value="수정"/></td>
</form>

<a href="getUserBoardList.do">내가 쓴 글</a>

</body>
</html>