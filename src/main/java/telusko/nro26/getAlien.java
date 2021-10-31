package telusko.nro26;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import telusko.nro26.dao.AlienDao;
import telusko.nro26.modelo.Alien;

public class getAlien extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      int add =Integer.parseInt(request.getParameter("add"));
      
      AlienDao dao=new AlienDao();
      Alien a1=dao.getAlien(add);
      
      RequestDispatcher rd=request.getRequestDispatcher("/Telusko/nro26/Mostrar_Alien.jsp");
      rd.forward(request, response);
   }

   /*--------------------------------------GET-------------------------------------------*/
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);

   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);
   }

   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
