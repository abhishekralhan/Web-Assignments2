<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="email" required="required" name="username" placeholder="Enter Email"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" required="required" name="password" placeholder="Enter Password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
        <%
            String msg = request.getParameter("msg");
            if (msg != null) {
        %>
        <%=msg%>
        <%

            }

        %>

</body>
</html>