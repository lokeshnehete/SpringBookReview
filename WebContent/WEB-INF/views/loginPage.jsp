<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>loginPage</title>
</head>
<body>
 <form method="post" action="login">
            
 <table border="2">
                    <tr><td><b>UserName</b></td> <td><input type="text" name="username"></td></tr>
                    <tr><td><b>Password</b></td> <td><input type="password" name="password"></td></tr>
                    <tr>
                    <td><b>Role</b></td> 
                    	<td><select name="role">
								  <option value="Admin">Admin</option>
								  <option value="User">User</option>
								  
							</select>
						</td>
					</tr>
                    <tr><td><input type="reset" value="Reset"></td>
                        <td><input type="submit" value="Login"></td>
  </table>
                
</form>
<a href="registerPage">New User</a>
</body>
</html>