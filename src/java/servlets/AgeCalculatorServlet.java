
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String message;
        String userage = request.getParameter("age");
        
        if(userage == null || userage.equals("")){
            message = "You must give your current age.";
        }
        else{
            try{
                int numberAge = Integer.parseInt(userage); 
                numberAge++;
                message = "Your age next birthday will be " + numberAge;            
        }   catch(NumberFormatException e){
                message = "You must give your current age.";
            }   
        }        
    
        request.setAttribute("output", message);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

}
