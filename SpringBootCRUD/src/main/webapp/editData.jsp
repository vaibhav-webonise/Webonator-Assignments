<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Add Data</h2>
		<form action="addEmployee">
			<input type="text" name="employeeId" value=${employee.employeeId}><br>
			<input type="text" name="employeeName" value=${employee.employeeName}><br>
			<input type="text" name="technology" value=${employee.technology}><br>
			<input type="submit"><br>
		 </form>
	</body>
</html>
