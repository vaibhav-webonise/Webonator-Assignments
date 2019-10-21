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
			 	<input type="text" name="employeeId"><br>
			 	<input type="text" name="employeeName"><br>
				<input type="text" name="technology"><br>
				<input type="submit"><br>
		 </form>
		 
		 <h2>Search Data</h2>
		 <form action="getEmployee">
				<input type="text" name="employeeId"><br><br>
			    <input type="submit"><br>
		 </form>
			 
		 <h2>Edit data</h2>
		 <form action="editEmployee">
			 	<input type="text" name="employeeId"><br>
				<input type="submit"><br>
		 </form>
			 
		 <h2>Delete data</h2>
		 <form action="deleteEmployee">
			 	<input type="text" name="employeeId"><br>
				<input type="submit"><br>
		 </form> 
	</body>
</html>
