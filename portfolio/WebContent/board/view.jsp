<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글 보기!!!!!!</title>
<link href="../css/board_combination.css" rel="stylesheet" type="text/css" >
</head>
<body>
	<a href="../main/main.jsp">
		<h1>MEET<br>MEAT</h1>
	</a>
	<form method="post" action="modifyOK.do">
	<div class="con">
		<table border="1">
			<tr>
				<td>닉네임</td><td>${dto.nickname}</td>
			</tr>
			<tr>
				<td>전화번호</td><td>${dto.cellphone}</td>
			</tr>
			<tr>
				<td>이름</td><td>${dto.name}</td>
			</tr>
			<tr>
				<td>제목</td><td>${dto.title}</td>
			</tr>
			<tr>
				<td>내용</td><td><textarea name="contents" cols="100" rows="15">${dto.contents}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<c:if test="${userInfo.id eq dto.id }">
						<input type="submit" value="수정">					
						<a href="delete.do?no=${dto.no}">삭제</a>
					</c:if>
					<a href="list.do">목록</a>
					<a href="reply.do?no=${dto.no}&id=${dto.id}">답변</a>
				</td>
			</tr>
		</table>
		</div>
		<input type="hidden" name="no" value="${dto.no}">
	</form>
</body>
</html>