

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment1
 */
@WebServlet("/Assignment1")
public class Assignment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ServletContext context;
	ServletConfig config;	
    public Assignment1() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
		context = getServletContext();
		config = getServletConfig();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>ServletContext parameters</h1>");
		Enumeration<String> e1 = context.getInitParameterNames();
		while (e1.hasMoreElements()) {
			String paramName = e1.nextElement();
			out.println(paramName + ": " + context.getInitParameter(paramName) + "<br />");
		}
		
		out.println("<h1>ServletConfig parameters</h1>");
		Enumeration<String> e2 = config.getInitParameterNames();
		while (e2.hasMoreElements()) {
			String paramName = e2.nextElement();
			out.println(paramName + ": " + config.getInitParameter(paramName) + "<br />");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
