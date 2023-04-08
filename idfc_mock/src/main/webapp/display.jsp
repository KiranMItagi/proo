<%@page import="com.jsp.dto.PersonDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3px">
		<tr>
		<th>name</th>
		<th>email</th>
		<th>phno</th>
		<th>bgroup</th>
		</tr>
		<%
			PersonDto personDto = (PersonDto)request.getAttribute("key3");
		%>
		<tr>
			<td><%=personDto.getName() %></td>
			<td><%=personDto.getEmail() %></td>
			<td><%=personDto.getPhno() %></td>
			<td><%=personDto.getBgroup() %></td>
		</tr>
	</table>
</body>
</html>