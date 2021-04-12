
package database;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class logout extends HttpServlet {
     public logout() {
        super();
     }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute("name");
        }
            RequestDispatcher dispatcher = request.getRequestDispatcher("signin.html");
            dispatcher.forward(request, response);
    
}
}
