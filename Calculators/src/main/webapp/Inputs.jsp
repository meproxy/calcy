<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: rgb(153, 255, 187);">
	<h2>Enter the Operands and Operator</h2>
	<form action="add" method="post">
		<p>
			Number 1 : <input type="text" name="n1">
		</p>
		<p>
			Enter Operator : <input type="text" size="1" maxlength="1" name="n3">
		</p>
		<p>
			Number 2 : <input type="text" name="n2">
		</p>
		<p>
			<input type="submit" value="Enter">
	</form>
	<%
	if (request.getAttribute("res") != null)
		out.println(request.getAttribute("res"));
	%>
</body>
</html>