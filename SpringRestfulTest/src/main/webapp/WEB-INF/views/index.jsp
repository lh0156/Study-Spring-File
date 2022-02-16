<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<style>
	
	</style>
</head>
<body>
	<!--  -->
	<main>
		<h1>REST Client Page</h1>
		
		<form id="form1">
		<table border width="300">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="아무개"></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" name="age" value="22"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" value="서울시 강남구 대치동"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="tel" name="tel" value="010-1111-2222"></td>
			</tr>
		</table>
		</form>
		<input type="button" value="추가하기" id="btn1">
		
		
	</main>
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>

		$("#btn1").click(()=>{
			
			
			$.ajax({
				type: 'POST',
				url: 'http://localhost:8090/address',
				data: $('#form1').serialize(),
				dataType: 'json',
				success: function(result) {
					alert(result);
				},
				error: function(a,b,c) {
					console.log(a,b,c);
				}
			});
			
			
		});
		
	</script>
</body>
</html>



















