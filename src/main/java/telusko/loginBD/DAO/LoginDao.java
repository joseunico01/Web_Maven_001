package telusko.loginBD.DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class LoginDao {
   
   String sql="select * from login where uname=? and pass=?";
   String url="jdbc:mysql://localhost:3306/navim";
   String username="root";
   String password="vasquez";

   public boolean check(String uname, String pass)
   {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection(url, username, password);
         PreparedStatement st=con.prepareStatement(sql);
         st.setString(1, uname);
         st.setString(2, pass);
         ResultSet rs=st.executeQuery();
         if(rs.next()){
            return true;
         }
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "No se pudo connectar"+e);
      }
      return false;
   }
}
