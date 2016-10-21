<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>resultPage</title>
</head>
<body>
<table  border="2">
      <thead>
      <tr>
	      <th>BookId</th>
	      <th>BookName</th>
	      <th>BookAuther</th>
	      <th>BookReview</th>   
	      <th>Actions</th>
      </tr>
      </thead>
      <tbody>
      <tr>
	      <th>${book.bookId}</th>
	      <th>${book.bookName}</th>
	      <th>${book.bookAuther}</th>
	      <th>${book.bookReview}</th>
	      <td>  
	      <a href="addReview/${book.bookId}">Add Review</a><br> 
      </tr>
      </tbody>
</table>
                <a href="welcomePage">back</a>
</body>
</html>