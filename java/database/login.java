package database;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
           String name = request.getParameter("username1");
          String pass = request.getParameter("pass1");
         Cookie ck=new Cookie("username",name);
          Cookie ck1=new Cookie("password",pass);
          ck.setMaxAge(24*365);
          ck1.setMaxAge(24*365);
          response.addCookie(ck);
          response.addCookie(ck1);
          
           
            try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net/sql6404713","sql6404713","349BgZYJMz");
           String sql = "select username,password from users where username = '"+name+"' and password ='"+pass+"'";
          PreparedStatement stmt = con.prepareStatement(sql);
      ResultSet rc=stmt.executeQuery();
         if(rc.next())
         {
            
              HttpSession session = request.getSession();
             
            RequestDispatcher rd=request.getRequestDispatcher("main1.html");
            rd.forward(request, response);
      }
         else{
         out.println("<h1>INVALID DATA</h1><br><h1>PLEASE TRY AGAIN</h1>");
         out.println("<h2><a href=signin.html>LOGIN</a></h2>");
         }
              }catch(Exception e){
              out.print(e);
          }
    }

}
    
        