<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link href="../css/pork.css" rel="stylesheet" type="text/css">
</head>
<body>
<header>
<%@ include file="../Header/header.jsp" %>
	<main>
	<div class="main_a">
		<img src="../img/porkMain.jpg" />
	</div>
		<div class="main_b">
		            <ul>
                <li>
                    <figure><a href="https://www.foodjang.com/goods/goods_view.php?goodsNo=1000000136"><img src="../img/pork_belly.jpg"></a></figure>
                    <figcaption>
                        <p><b>삼겹살 500g<br>
                                6,500원<br></b></p>
                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>
                    </figcaption>
                </li>
                <li>
                    <figure><a href="https://www.foodjang.com/goods/goods_view.php?goodsNo=1000002851"><img src="../img/pork_neck.jpg"></a></figure>
                    <figcaption>
                        <p><b>이베리코 목살스테이크 300g<br>
                                39,900원<br></b></p>
                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>
                    </figcaption>
                </li>
                <li>
                    <figure><a href="https://www.foodjang.com/goods/goods_view.php?goodsNo=1000000095"><img src="../img/pork_neck2.jpg"></a></figure>
                    <figcaption>
                        <p><b>항정살 350g<br>
                                6,900원<br></b></p>
                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>
                    </figcaption>
                </li>
		</div>
	</main>
	<%@ include file="../Footer/footer.jsp" %>
</body>
</html>