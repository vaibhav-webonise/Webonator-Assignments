<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
	<h3>Database</h3>
			<table border="1">
				<thead>
					<tr>
						<td>ID</td>
						<td>NAME</td>
						<td>TYPE</td>
					</tr>
				</thead>
	
				<tbody>
					<c:forEach var="system" items="${systems}">
						<tr>
							<td>${system.systemId}</td>
							<td>${system.systemName}</td>
							<td>${system.systemType}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	</body>
</html>
