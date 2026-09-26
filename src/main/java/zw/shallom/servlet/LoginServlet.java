package zw.shallom.servlet;
import javax.servlet.annotation.*;import javax.servlet.http.*;import javax.servlet.*;import java.io.IOException;import zw.shallom.service.SchoolService;import zw.shallom.model.User;import zw.shallom.exception.InvalidLoginException;
@WebServlet("/login") public class LoginServlet extends HttpServlet {
 protected void doGet(HttpServletRequest q,HttpServletResponse p)throws ServletException,IOException{q.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(q,p);}
 protected void doPost(HttpServletRequest q,HttpServletResponse p)throws ServletException,IOException{try{User u=((SchoolService)getServletContext().getAttribute("school")).authenticate(q.getParameter("username"),q.getParameter("password"));q.getSession(true).setAttribute("user",u);p.sendRedirect(q.getContextPath()+"/app/dashboard");}catch(InvalidLoginException e){q.setAttribute("error",e.getMessage());doGet(q,p);}}
}
