<%@page import="java.io.Console" %>
<%@page import="koo.bon.moo.dto.MemberDTO" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="javax.sql.*" %>
<%@page import="javax.naming.*" %>
<%@page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h3>아이디 중복 확인 결과</h3>
	<%
	String id=request.getParameter("id");
	
	String id2 = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemberDTO dto = new MemberDTO();
	
	try{
		Context init = new InitialContext();
		DataSource dataSource = (DataSource)init.lookup("java:comp/env/jdbc/testdb");
		conn=dataSource.getConnection();
		
		pstmt=conn.prepareStatement("select * from member where id=?");
		pstmt.setString(1,id);
		rs = pstmt.executeQuery();
		
		if(rs.next()) id2 = rs.getString("id");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	out.println("입력 ID : <strong>" + id + "</stong>");
	if(id2==null){
		out.println("<p>사용 가능한 아이디입니다.</p>");
		out.println("<a href='javascript:apply(\"" + id + "\")'>[적용]</a>");
		%>

	<%
		System.out.println(id);
	%>
	
	
	
	
	
	<%
	}else{
		out.println("<p style='color: red'>해당 아이디는 사용하실 수 없습니다.</p>");
	}
%>
	<hr>
	<a href="javascript:history.back()">[다시시도]</a>
	&nbsp; &nbsp;
	<a href="javascript:window.close()">[창닫기]</a>
	
	
	<script>
	function apply(id2){
		opener.document.getElementById('id').value=id2;
		window.close(); //창닫기
	}
	</script>
</body>
</html>