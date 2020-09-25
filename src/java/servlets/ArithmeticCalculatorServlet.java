package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String answer;
        int result = 0;
        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String operator = request.getParameter("calc");

        request.setAttribute("firstInput", firstInput);
        request.setAttribute("secondInput", secondInput);

        if (firstInput == null || firstInput.equals("") || secondInput == null || secondInput.equals("")) {
            answer = "invalid";
        } else {
            try {
                int firstValue = Integer.parseInt(firstInput);
                int secondValue = Integer.parseInt(secondInput);

                switch (operator) {
                    case "+":
                        result = firstValue + secondValue;
                        break;
                    case "-":
                        result = firstValue - secondValue;
                        break;
                    case "*":
                        result = firstValue * secondValue;
                        break;
                    case "%":
                        result = firstValue % secondValue;
                        break;
                    default:
                        break;
                }

                answer = Integer.toString(result);

            } catch (NumberFormatException e) {
                answer = "invalid";
            }
        }

        request.setAttribute("output", answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

}
