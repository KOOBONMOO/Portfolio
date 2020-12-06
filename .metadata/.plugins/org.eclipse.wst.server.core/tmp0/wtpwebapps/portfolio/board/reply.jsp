<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>답변!!!!!!!!</title>
<link href="../css/board_combination.css" rel="stylesheet" type="text/css" >
</head>
<body>
	<a href="../main/main.jsp">
		<h1>MEET<br>MEAT</h1>
	</a>
	<form method="post" action="replyOK.do">
	<div class="con">
		<table border="1">
			<tr>
				<td>닉네임</td><td>${userInfo.nickname}</td>
			</tr>
			<tr>
				<td>전화번호</td><td>${userInfo.cellphone}</td>
			</tr>
			<tr>
				<td>이름</td><td>${userInfo.name }</td>
			</tr>
			<tr>
				<td>제목</td><td><input type="text" name="title" value="re: ${dto.title}"/></td>
			</tr>
			<tr>
				<td>내용</td><td><textarea name="contents" cols="100" rows="15" autofocus>&#10&#13re: ${dto.contents}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="답변"> 
					<a href="list.do">목록</a>
				</td>
			</tr>
		</table>
		</div>
		<input type="hidden" name="no" value="${dto.no}" />
		<input type="hidden" name="id" value="${userInfo.id }" />
		<input type="hidden" name="groupNum" value="${dto.groupNum}" />
		<input type="hidden" name="stepNum" value="${dto.stepNum}" />
		<input type="hidden" name="indentNum" value="${dto.indentNum}" />
	</form>
</body>
</html>