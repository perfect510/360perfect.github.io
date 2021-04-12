
package database;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;



public class database1 extends HttpServlet {
    
     @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
      
         Statement stmt=null;

        Connection con=null;
        
   
        String a=request.getParameter("vname");
        String b=request.getParameter("tname");
        String c=request.getParameter("mname");
        String d=request.getParameter("moname");
        String e=request.getParameter("mileage");
        String f=request.getParameter("power");
        String g=request.getParameter("color");
        String h=request.getParameter("fuel");
        String i=request.getParameter("Gear");
        String j=request.getParameter("desc");
        String k=request.getParameter("email");
        String l=request.getParameter("desc1");
        String o=request.getParameter("contact");
        String q=request.getParameter("sname");
         int m=Integer.parseInt(request.getParameter("doors"));
        int n=Integer.parseInt(request.getParameter("seats"));
         
      try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net/sql6404713","sql6404713","349BgZYJMz");
            stmt=con.createStatement();
          
            stmt.executeUpdate("insert into seller values(' "+a+" ',' "+b+" ',' "+c+" ',' "+d+" ',' "+e+" ',' "+f+" ',' "+g+" ',' "+m+" ',' "+h+" ',' "+i+" ',' "+n+" ',' "+j+" ',' "+o+" ',' "+k+" ',' "+l+" ',' "+q+" ')");
          
           out.println("<html><body style=background-color: black>");
          out.println("<h1  style=background-color: white>FORM SUBMITTED SUCCESSFULLY.<br> PLEASE CHECK THE BUYING SECTION TO SEE THE DETAILS</h1>");
          out.println("<a href=buying.jsp>BUYING</a>");
          out.println("</body>");
         out.println("</html>");

        }
                 
  
        catch(Exception t){
            out.print(t);
        }
             }
        
    }
        
    
        

 

