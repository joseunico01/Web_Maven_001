<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
      <title>JSP Page</title>
   </head>
   <body>
<%
   //Para q no se guarde en el cache y asi no tener fallas en el login 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
   response.setHeader("Pragma", "no-cache");//HTTP 1.0
   response.setHeader("Expires", "0");//Proxies
   
   if(session.getAttribute("username")==null)
   {
      response.sendRedirect("/Web_Maven/Telusko/login/login.jsp");
   }
%>
      <h1> bienvenido a videos XD</h1>
 
<div class="embed-responsive embed-responsive-16by9">
     <iframe width="708" height="480" src="https://www.youtube.com/embed/q_acIRZLmtQ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> 
</div>
   </body>
</html>
