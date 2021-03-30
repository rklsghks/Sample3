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
	
	<form action="/board/search" method="post">
		<input name="name">
		<button type="submit">검색</button>
	</form>
	<table border="1">
		<tr>
			<th>no</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${boardList }" var="list">
			<tr>
				<td>${list.boardNo }</td>
				<td>${list.title }</td>
				<td>${list.name }</td>
				<td>${list.views }</td>
				<fmt:formatDate value="${list.regDate }" pattern="yyyy-MM-dd" var="regDate"/>
				<td>${regDate }</td>
				<td><input type="button" onclick="location.href='/board/read?boardNo=${list.boardNo}'" value="조회"></td>
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
		
		function readBtn() {
			
			jQuery('#boardNo').val($boardNo);			
		}
	
	</script>
</body>
</html>