<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<table border="1">
		<tr>
			<th>no</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		<tr>
			<td>${vo.boardNo }</td>
			<td>${vo.title }</td>
			<td>${vo.name }</td>
			<td>${vo.views }</td>
			<fmt:formatDate value="${vo.regDate }" pattern="yyyy-MM-dd" var="regDate"/>
			<td colspan="2">${regDate }</td>
		</tr>
		<tr>
			<td colspan="5">${vo.content }a<td>
		</tr>
		</table>
		<input type="button" onclick="location.href='/board/update?boardNo=${vo.boardNo}'" value="수정">
		<input type="button" onclick="location.href='/board/delete?boardNo=${vo.boardNo}'" value="삭제">
</body>
</html>