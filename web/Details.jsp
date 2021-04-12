
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="newcss22.css">
         <link rel="shortcut icon" type="image/jpeg" href="images1/icon.png">
        <title>Details</title>
    </head>
    <body class="container">
           <div class="logo_container">
               <nav>
                   <img src="images1/logo.jpg" class="logo">
                <ul>
                      <li><a href="main1.html">Home</a></li>
                   <li><a href="list of shops1.html">List of shops</a></li>
                   <li><a href="buying.jsp">Buying</a></li>
                   <li><a href="selling.html">Selling</a></li>
                   <li><a href="#">Live customization</a>
                       <ul>
                           <li><a href="Interior.html">Interior</a></li>
                             <li><a href="Exterior.html">Exterior</a></li>
                         </ul>
                   </li>
                 </ul>
               </nav>
             </div>
          <form>
        <table border="1" cellpadding="10" cellspacing="2" class="table2" style="color: white">
            <tr>
               
                <th> Mileage </th>
                <th> Power </th>
                <th> Color </th>
                <th> Doors </th>
                <th> Fuel Type </th>
                <th> GearBox </th>
                <th> Number of seats </th>
                <th> Modification Description </th>
               
                <th> Email </th>
               
           </tr>
            
           
               <%
                   try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection conn=DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net/sql6404713","sql6404713","349BgZYJMz");
                       String Query="select * from seller";
                       Statement stmt=conn.createStatement();
                       ResultSet rs=stmt.executeQuery(Query);
                       while(rs.next()){
                          %>
           <tr>
                          <td><%= rs.getString("Mileage")  %></td>
                            <td><%= rs.getString("Power")  %></td>
                            <td> <%= rs.getString("Color")  %></td>
                           <td> <%= rs.getInt("Doors")  %></td>
                          <td><%= rs.getString("Fuel Type")  %></td>
                         <td> <%= rs.getString("GearBox")  %></td>
                         <td> <%= rs.getInt("Number of seats")  %></td>
                              <td><%= rs.getString("Modification Description")  %></td>
                             
                             <td><%= rs.getString("Email")  %></td>
                        
           </tr>
                               
                               <%
                          
                       }
                       
                       
                   }
                   
                   catch(Exception e){
                       out.println(e);
                   }
 %>         
        </table>
    
          </form>

    </body>
</html>
