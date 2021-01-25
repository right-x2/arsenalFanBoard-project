<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
<title>글 상세</title>
</head>
<body>
<center>
<h1>글 상세</h1>
<a href="logout_proc.jsp">Log-out</a>
<hr>
<form action="updateBoard.do" method="post">
<input name="seq" type="hidden" value="${board.seq}">
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input name="title" type="text" value="${board.title}"/></td>
		</tr>
		<tr>
			<td bgcolor="orange" >작성자</td>
			<td align="left">${board.writer}</td>
		</tr>
		<tr>
			<td bgcolor="orange">내용</td>
			<td align="left">
				<textarea name="content" cols="40" rows="10">
					${board.content}
				</textarea>
			</td>
		</tr>
		<tr>
			<td bgcolor="orange" >등록일</td>
			<td align="left">${board.regDate}</td>
		</tr>
		<tr>
			<td bgcolor="orange" >조회수</td>
			<td align="left">${board.cnt}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="글 수정"/>
			</td>
		</tr>
	</table>
</form>
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<c:forEach items="${answerList}" var="answer">
			<tr>
				<td bgcolor="orange" >${answer.writer}</td>
				<td align="left">${answer.content}</a></td>
				<td>${answer.answerRegDate}</td>
			</tr>
		</c:forEach> 
	<form action="insertAnswer.do" method="post">
		<tr>
			<td bgcolor="orange" >작성자</td><td><input type="text" name="writer"value="${nickName}" readonly /></td>
			<td align="left">
				<textarea name="content">
					
				</textarea>
			</td>
			<td><input type="submit" value="확인"/></td>
		</tr>
	</form>
	</table>

<hr>
<a href="insertBoard.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=${board.seq}">글 삭제</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.do">글 목록</a>
</center>
</body>
</html>