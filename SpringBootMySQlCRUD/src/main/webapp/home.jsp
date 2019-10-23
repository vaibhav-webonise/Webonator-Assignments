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
			<h3>Add data</h3>
			<form action="addData">
				System ID:<input type="number" name="systemId" value=${system.systemId}><br/>
				System Name:<input type="text" name="systemName" value=${system.systemName}><br/>
				System Type:<input type="text" name="systemType" value=${system.systemType}><br/> 
				<input type="submit">
			</form>
			<br />
			<br />
			
			<h3>Edit data</h3>
			<form action="editData">
				 ID:<input type="number" name="systemId"><br />
				 <input type="submit">
			</form>
			<br />
			<br />
			
			<h3>Delete data</h3>
			<form action="deleteData">
				ID:<input type="number" name="systemId"><br/>
			    <input type="submit">
			</form>
			<br />
			<br />	
			
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
