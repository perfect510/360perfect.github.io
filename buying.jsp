<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="newcss22.css">
         <link rel="shortcut icon" type="image/jpeg" href="images1/icon.png">
        <title>Buying</title>
    </head>
    <body class="container">
        <form>
           
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
           
     
        <table class="table1"   border="1" cellpadding="10" cellspacing="2" style="color: white">
            <tr>
                <th> Vehicle Name </th>
                <th> Type </th>
                <th> Make </th>
                <th> Model </th>
                 <th> Seller Name </th>
                <th> Contact Details</th>
                  <th> Address </th>
               
                  <th class="nob"><a href="Details.jsp" style="text-decoration: none;color: white;font-weight: bolder;" class="rdmore"> Read more</a></th>
           </tr>
           
           
               <%
                    
                    
                   try
                   {
                       
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection conn=DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net/sql6404713","sql6404713","349BgZYJMz");
                      PreparedStatement ps=conn.prepareStatement("select * from seller");
                      ResultSet rs=ps.executeQuery();
                   
                   
                       while(rs.next()){
                  
                     %>
           <tr>
                           <td> <%= rs.getString("Vehicle Name") %></td>
                            <td> <%= rs.getString("Type")  %></td>
                            <td> <%= rs.getString("Make")  %></td>
                            <td><%= rs.getString("Model")  %></td>
                           <td><%= rs.getString("Seller Name")  %></td>
                            <td><%= rs.getString("Contact Details") %></td>
                            <td> <%= rs.getString("Address")  %></td>
                           
                            
                               
           </tr>
                               
                               <%
                               }    
                          
                       }
                       
                       
                   
                   
                   catch(Exception e){
                       System.out.println(e);
                   }
  %>       
  

        </table>
    <h3 class="h3" style="color: red">To see the car, please CONTACT the seller</h3>

        </form>
     
    </body>
</html>
