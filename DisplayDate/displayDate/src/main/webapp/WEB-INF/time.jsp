<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body {
		margin: 0px 500px 0px 500px;
		}
	h1 {
		color: green;
		margin-top: 200px;
		white-space: nowrap;
	}
</style>
</head>
<body onload = "pageInfoTime()">
	<h1>${time}</h1>
	
	<script src="/js/date.js"></script>
</body>
</html>