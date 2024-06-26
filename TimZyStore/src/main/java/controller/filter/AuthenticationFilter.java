package controller.filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = { "/*" })
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false);

        boolean loggedIn = (session != null && session.getAttribute("username") != null && session.getAttribute("accountType") != null);
        String requestURI = httpRequest.getRequestURI();
        boolean adminRequest = requestURI.endsWith("/HomeAdmin");

        if (adminRequest && (!loggedIn || !"Admin".equals(session.getAttribute("accountType")))) {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/pages/Login.jsp");
            return;
        }

        chain.doFilter(request, response);
    }


    @Override
    public void destroy() {

    }
}
