<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>deptview.jsp</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h3 style="margin-bottom: 50px; border-bottom: 1px solid gray;">하나의 부서 정보 보기</h3>

	<table id="customers">
		<tr>
			<!-- table header약자 -->
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
 
		<tr>
			<td>${requestScope.one.deptno}</td>
			<td>${requestScope.one.dname}</td>
			<td>${requestScope.one.loc}</td>
		</tr>

</body>
</html>