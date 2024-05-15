package controller.servles;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.DatabaseController;
import utils.StringUtils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	controller.DatabaseController dbController = new DatabaseController();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter(StringUtils.user_name);
        String password = request.getParameter(StringUtils.password);
        int login_result = dbController.getUserLogin(username, password);
        System.out.println("login result is :" + login_result);
        
        if (login_result == 1) {
        	HttpSession session = request.getSession();
            int userId = dbController.getUserId(username);
            String accountType = dbController.getAccountType(userId);
            session.setAttribute("username", username);
            session.setAttribute("userId", userId); 
            session.setAttribute("accountType", accountType);
            session.setMaxInactiveInterval(30 * 60);//setting the maximum session timeout to 30 minutes
            /* session part end *
             *----- cookie start-----*/
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(30 * 60); //cookie expires after 30 minutes
            response.addCookie(userCookie);
            //creating a new cookie for the account type
            Cookie accountTypeCookie = new Cookie("accountType", accountType);
            accountTypeCookie.setMaxAge(30 * 60); //cookie expires after 30 minutes
            response.addCookie(accountTypeCookie);
            response.sendRedirect(request.getContextPath() + StringUtils.HOME_PAGE);
        } 
        else if (login_result == 2) {
        	HttpSession session = request.getSession();
            
            int userId = dbController.getUserId(username);
            String accountType = dbController.getAccountType(userId);
            session.setAttribute("userId", userId);
            session.setAttribute("username", username);
            session.setAttribute("accountType", accountType);
            /* session part end 
             *----- cookie start-----*/
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(30 * 60); //cookie expires after 30 minutes
            response.addCookie(userCookie);
            //creating a new cookie for the account type
            Cookie accountTypeCookie = new Cookie("accountType", accountType);
            accountTypeCookie.setMaxAge(30 * 60); //cookie expires after 30 minutes
            response.addCookie(accountTypeCookie);
            response.sendRedirect(request.getContextPath() + StringUtils.ADMIN_HOME_SERVLET);	
        } 
        else if (login_result == 0) {
            request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.INCORRECT_LOGIN_CREDENTIAL_ERROR);
            System.out.println("Username or Password Incorrect");
            request.getRequestDispatcher(StringUtils.LOGIN_PAGE).forward(request, response);
        } 
        else {
            request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.SERVER_ERROR_MESSAGE);
            request.getRequestDispatcher(StringUtils.LOGIN_PAGE).forward(request, response);
        }

    }
}
