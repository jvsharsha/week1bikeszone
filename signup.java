package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str2=request.getParameter("psd");
		String str3=request.getParameter("cpsd");
	if(	str2.equals("Niit12")&& str3.equals("Niit12"))
			{
		RequestDispatcher rd=request.getRequestDispatcher("welcome1.html");
			rd.forward(request,response);
			}
			else
	    {
		RequestDispatcher rd=request.getRequestDispatcher("signup.html");
		rd.forward(request,response);
		}
	}

}
