<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
        <head>
            <title>Employee Page</title>
        </head>
        <center>
        <body>
            <h1>
                Add a Employee
            </h1>

            <c:url var="addAction" value="/employee/add"/>
            <form:form action="${addAction}" commandName="employee">
                <table>
                    <c:if test="${!empty employee.name}">
                        <tr>
                            <td>
                                <form:label path="id">
                                    <spring:message text="ID"/>
                                </form:label>
                            </td>
                            <td>
                                <form:input path="id" readonly="true" size="8" disabled="true"/>
                                <form:hidden path="id"/>
                            </td>
                        </tr>
                    </c:if>
                    <tr>
                        <td>
                            <form:label path="name">
                                <spring:message text="Name"/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="name"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="country">
                                <spring:message text="Country"/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="country"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <c:if test="${!empty employee.name}">
                                <input type="submit"
                                       value="<spring:message text="Edit employee"/>"/>
                            </c:if>
                            <c:if test="${empty employee.name}">
                                <input type="submit"
                                       value="<spring:message text="Add employee"/>"/>
                            </c:if>
                        </td>
                    </tr>
                </table>
            </form:form>
            <br>
            <h3>Employee List</h3>
            <c:if test="${!empty listEmployees}">
                <table class="tg">
                    <tr>
                        <th width="80">Employee ID</th>
                        <th width="120">Employee Name</th>
                        <th width="120">Employee Country</th>
                        <th width="60">Edit</th>
                        <th width="60">Delete</th>
                    </tr>
                    <c:forEach items="${listEmployees}" var="employee">
                        <tr>
                            <td>${employee.id}</td>
                            <td>${employee.name}</td>
                            <td>${employee.country}</td>
                            <td><a href="<c:url value='/edit/${employee.id}' />">Edit</a></td>
                            <td><a href="<c:url value='/remove/${employee.id}' />">Delete</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </body>
    </center>
</html>
