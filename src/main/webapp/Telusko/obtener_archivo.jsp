<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <h1>ENVIAR UN ARCHIVO POR JSP MEDIANTE UN SERVLET A UN DIRECTORIO Q NOSOTROS CREAMOS</h1>
      <form action="http://localhost:8081/Web_Maven001/FileUpload" method="post" enctype="multipart/form-data">
         <input type="file" name="file" multiple><br>
         <input type="submit">
      </form>
   </body>
</html>
