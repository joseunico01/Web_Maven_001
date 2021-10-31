<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP welcome</title>
   </head>
   <body>
<%
   //Para q no se guarde en el cache y asi no tener fallas en el login 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Pragma", "no-cache");//HTTP 1.0
   response.setHeader("Expires", "0");//Proxies
   
   if(session.getAttribute("username")==null)
   {
      response.sendRedirect("/Web_Maven/Telusko/login/login.jsp");
   }
%>
      <h1>Bienvenido a welcome ${username}</h1>

      <a href="videos.jsp">Videos here</a>

      <form action="<%=request.getContextPath()%>/LogoutBD">
         <input type="submit" value="Logout">
      </form>
   </body>
</html>
