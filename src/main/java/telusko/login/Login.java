package telusko.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);
   }

/*
--------------------------- POST  -----------------------
   
 */
   
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      //processRequest(request, response);
      String uname=request.getParameter("uname");
      String pass=request.getParameter("pass");

      if(uname.equals("telusko") && pass.equals("lear"))
      {
         HttpSession session=request.getSession();
         session.setAttribute("username", uname);
         response.sendRedirect("/Web_Maven001/Telusko/login/welcome.jsp");
      }else
      {
         response.sendRedirect("/Web_Maven001/Telusko/login/login.jsp");
      }
   }

   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
