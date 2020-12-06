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
<title>Insert title here</title>
</head>
<body>
	<h3> 아이디 중복체크 </h3>
	<form method="post" action="idChecOK.jsp" onsubmit="return blankCheck(this)">
		아이디 : <input type="text" name="id" maxlength="10" autofocus>
		<input type="submit" value="중복확인">
	</form>

	<script>
	function blankCheck(f){
		var id=f.id.value;
		id=id.trim();
		if(id.length<5){
			alert("아이디는 5자 이상 입력해주십시오.");
			return false;
		}
		return true;
	}
	</script>
</body>
</html>