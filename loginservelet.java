package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class loginservelet
 */
@WebServlet("/loginservelet")
public class loginservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginservelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("user");
		String str2=request.getParameter("psd");
	if(	str1.equals("niit")&& str2.equals("Niit12"))
			{
		RequestDispatcher rd=request.getRequestDispatcher("welcome1.html");
			rd.forward(request,response);
			}
			else
	    {
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request,response);
		}
	}
}
