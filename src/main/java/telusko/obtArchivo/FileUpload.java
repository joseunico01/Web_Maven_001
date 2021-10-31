package telusko.obtArchivo;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      processRequest(request, response);
   }

   
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      
      ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
      try {
         List<FileItem> multifiles =sf.parseRequest(request);

         for(FileItem item:multifiles){
            item.write(new File("C:\\Users\\josek\\Documents\\NetBeansProjects\\Web_Maven001\\"+item.getName()));
         }
         JOptionPane.showMessageDialog(null, "Cargando en proceso");
         
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error "+e);
      }
      processRequest(request, response);
   }

   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
