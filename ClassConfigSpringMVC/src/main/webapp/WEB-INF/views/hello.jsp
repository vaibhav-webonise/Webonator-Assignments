<%--
  Created by IntelliJ IDEA.
  User: webonise
  Date: 23/10/19
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello</title>
    </head>
    <body>
        <table>
            <tr>
                <td>ID</td>
                <td>NAME</td>
                <td>COURSE</td>
            </tr>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
            </tr>
        </table>
    </body>
</html>
