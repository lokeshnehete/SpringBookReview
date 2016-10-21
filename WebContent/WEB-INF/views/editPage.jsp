<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>editPage</title>
</head>
<body>
<form action="edit/${bk.bookId}/update" method="post">
<table  border="2">
      <thead>
      <tr>
	  		<th></th>
	        <th></th>  
      </tr>
      </thead>
      <tbody> 
      <tr><td><b>Book Id</b></td><td><input type="text" name="bookId" value="${book.bookId}" readonly="readonly"></td></tr>
      		<tr><td><b>Enter Book Name</b></td><td><input type="text" name="bookName" value="${book.bookName}"> </td></tr>
	  		<tr><td><b>Enter Book's Auther Name</b></td><td><input type="text" name="bookAuther" value="${book.bookAuther}"></tr>
	  		<tr><td><b>Enter Book Review</b></td><td><input type="text" name="bookReview" value="${book.bookReview}"></tr>
      </tbody>
      <tr><td><input type="submit" value="update"></td></tr> 
</table>  
</form>         
</body>
</body>
</html>