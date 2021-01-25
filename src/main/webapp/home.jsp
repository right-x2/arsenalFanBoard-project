<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
<title>글목록</title>
</head>
<body>
<center>
<h1>글목록</h1>
<c:if test="${not empty nickName}">
	<h3>${nickName}님 환영합니다...<a href="logout.do">Log-out</a></h3><br>
	<h3><a href="userInfo.do">내정보</a></h3><br>
	<a href="insertBoard.jsp">글 등록</a>
</c:if>
<c:if test="${empty nickName}">
	<h3><a href="logout.do">Log-in</a></h3>
</c:if>
<!-- 검색시작 -->
<form action="getBoardList.do" method="post">
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<td align="right">
				<input name="searchKeyword" type="text"/>
				<input type="submit" value="검색"/>
			</td>
		</tr>
	</table>
</form>


<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
	<th bgcolor="orange" width="100">번호</th>
	<th bgcolor="orange" width="100">제목</th>
	<th bgcolor="orange" width="100">작성자</th>
	<th bgcolor="orange" width="100">등록일</th>
	<th bgcolor="orange" width="100">조회수</th>
</tr>
<c:forEach items="${boardList}" var="board">
<tr>
	<td>${board.seq}</td>
	<td align="left"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
	<td>${board.writer}</td>
	<td>${board.regDate}</td>
	<td>${board.cnt}</td>
</tr>
</c:forEach> 

</table>
</center>
</body>
</html>