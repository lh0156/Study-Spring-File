<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<%@ include file="/inc/asset.jsp" %>
	<style>
		.table { width: 500px; }
	</style>
</head>
<body>
	<!-- ex03.jsp -->
	<div class="container">
		<h1 class="page-header">데이터 전송 <small>Spring</small></h1>
		
		<h3>Form 전송</h3>
		<form method="GET" action="/spring/ex03ok.do">
			<table class="table table-bordered">
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" class="form-control"></td>
				</tr>
				<tr>
					<th>나이</th>
					<td><input type="number" name="age" class="form-control"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="address" class="form-control"></td>
				</tr>
			</table>
			<div>
				<input type="submit" value="보내기" class="btn btn-default">
			</div>
		</form>
		
		<h3>URL 전송</h3>
		
		
	</div>
	
	<script>
	
	</script>
</body>
</html>



















