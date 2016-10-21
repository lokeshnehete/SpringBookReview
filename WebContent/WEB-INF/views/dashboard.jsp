<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<form action="addrecords" method="post" >
<table  border="2">

	<tr><td><b>Enter Book Id</b></td><td><input type="text" name="bookId"></tr>
	<tr><td><b>Enter Book Name</b></td><td><input type="text" name="bookName"></tr>
	<tr><td><b>Enter Book's Auther Name</b></td><td><input type="text" name="bookAuther"></tr>
	<tr><td><b>Enter Book Review</b></td><td><input type="text" name="bookReview"></tr>

	<tr><td><input type="reset" value="Reset"></td>
		<td><input type="submit" value="Insert"></td>
	

</table>
<a href="recordsPage">bookrecords</a>

</form>
<a href="loginPage">logout</a>
</body>
</html>