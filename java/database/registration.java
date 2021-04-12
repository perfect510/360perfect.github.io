
package database;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
           String name = request.getParameter("username");
          String email = request.getParameter("email");
           String pass = request.getParameter("pass");
           PreparedStatement st=null;
           
            try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net/sql6404713","sql6404713","349BgZYJMz");
     String sql = "insert into users (username, email, password) values(?, ?, ?)";
      st=con.prepareStatement(sql);
      
       st.setString(1, name);
      st.setString(2, email);
      st.setString(3,pass);
    int rs=st.executeUpdate();
 
      if(rs!=0){
         
        out.println("<h1>REGISTRATION SUCCESSFULL</h1>");
           out.println("<h2><a href=signin.html>LOGIN</a></h2>");
      }
            }catch(Exception e){
                out.print("<h1>USERNAME ALREADY USED. PLEASE TRY AGAIN</h1>");
                out.println("<h2><a href=register.html>Register</a></h2>");
          
            }
        }
    }
          
        
    

