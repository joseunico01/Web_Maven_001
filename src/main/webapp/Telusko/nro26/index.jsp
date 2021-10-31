<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <form action="<%=request.getContextPath()%>/getAlien" method="get">
         <input type="text" name="add">
         <input type="submit" value="enviar">
      </form>
   </body>
</html>
