package controller.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import stringutils.StringUtils;

@WebServlet("/UserLogin")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    controller.DatabaseController dbController = new controller.DatabaseController();

    public LoginServlet() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests here
        String username = request.getParameter("user_name");
        String password = request.getParameter("password");

        int loginResult = dbController.getUserLoginInformation(username, password);
        
        if (loginResult == 1) {
            request.getSession().setAttribute("username", username);
            // Set session timeout (optional)
//            session.setMaxInactiveInterval(30 * 60); // 30 minutes
            response.sendRedirect(request.getContextPath() + Utilities.HOME_PAGE);
        } 
        else if (loginResult == 2) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + "/pages/Admin.jsp");
        } 
        else if (loginResult == 0) {
            request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.INCORRECT_LOGIN_CREDENTIAL_ERROR);
            System.out.println("Username or Password Incorrect");
            request.getRequestDispatcher(Utilities.LOGIN_PAGE).forward(request, response);
        } 
        else {
            request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.SERVER_ERROR_MESSAGE);
            request.getRequestDispatcher(Utilities.LOGIN_PAGE).forward(request, response);
        }
    }
}
