<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
		<body>
			<table border="1">
				<thead>
					<tr>
						<td>ID</td>
						<td>NAME</td>
						<td>TECHNOLOGY</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${employee.employeeId}</td>
						<td>${employee.employeeName}</td>
						<td>${employee.technology}</td>
					</tr>
				</tbody>
			</table>	
		</body>
</html>
