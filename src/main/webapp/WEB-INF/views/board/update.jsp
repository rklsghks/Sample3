<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<form action="/board/update" method="post">
		board_no, name, pw, title, content, file_name<br>
		<label>이름</label>
		<input name="name" required="required" autofocus="autofocus"><br>
		<label>pw</label>
		<input name="pw" required="required"><br>
		<label>제목</label>
		<input name="title" required="required"><br>
		<label>내용</label>
		<textarea name="content" required="required" rows="10" cols="10"></textarea><br>
		<input name="fileName" value="미구현" hidden="">
		<input name="boardNo" value="${boardNo }" hidden="">
		<button type="submit">글 작성</button>
	</form>
</body>
</html>