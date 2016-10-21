<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RecordsPage</title>
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
      <c:forEach items="${books}" var="bk">
      <tr>
	      <th><c:out value="${bk.bookId}"/></th>
	      <th><c:out value="${bk.bookName}"/></th>
	      <th><c:out value="${bk.bookAuther}"/></th>
	      <th><c:out value="${bk.bookReview}"/></th> 
      <td>  
	      <a href="edit/${bk.bookId}">Edit</a><br>  
	      <a href="delete/${bk.bookId}">Delete</a><br>  
      </td>  
      </tr>
      </c:forEach>
      </tbody>
</table>
                <a href="dashboard">back</a>
</body>
</html>