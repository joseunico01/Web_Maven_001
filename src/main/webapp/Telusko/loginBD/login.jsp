<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <h1>Hello World!</h1>

      <form action="<%=request.getContextPath()%>/LoginBD" method="post">
         Enter username: <input type="text" name="uname"><br>
         Enter password: <input type="password" name="pass"><br>
         <input type="submit" value="login">
      </form>
   </body>
</html>
