
package telusko.loginBD;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import telusko.loginBD.DAO.LoginDao;

public class LoginBD extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {

   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);
   }
   
   /* ---------------------------POST--------------------------*/

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      //processRequest(request, response);
      String uname=request.getParameter("uname");
      String pass=request.getParameter("pass");

      LoginDao dao=new LoginDao();
      
      if(dao.check(uname, pass))
      {
         HttpSession session=request.getSession();
         session.setAttribute("username", uname);
         response.sendRedirect("/Web_Maven001/Telusko/loginBD/welcome.jsp");
      }else
      {
         response.sendRedirect("/Web_Maven001/Telusko/loginBD/login.jsp");
      }
   }

   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
