

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookies
 */
@WebServlet("/Assignment2")
public class Assignment2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int i=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 Cookie cookie = null;
	      Cookie[] cookies = null;
	     // Cookie cookie1 = new Cookie(i+"",i+"");
	      i++;
	      PrintWriter out = response.getWriter();
	      /*
	      cookie1.setMaxAge(60*60*24);
	      response.addCookie( cookie1 );*/
	      
	      cookies = request.getCookies();
          response.setContentType("text/html");

	      
	      out.println(
	    	         "<html>\n" +
	    	         
	    	         "<body>" );

	    	      if( cookies != null ) {
	    	         out.println("<table border='1'><tr><th>Name</th><th>Value</th></tr>");

	    	         for (int i = 0; i < cookies.length; i++) {
	    	        	 out.print("<tr><td>");
	    	            cookie = cookies[i];
	    	            out.print(cookie.getName( ));
	    	            out.print("</td><td>");
			    	       
	    	            out.print(cookie.getValue( ));
	    	            out.print("</td><tr>");
		    	           
	    	         }
	    	      } else {
	    	         out.println("<h2>No cookies</h2>");
	    	      }
	    	      out.println("</table></body>");
	    	      out.println("</html>");
	    	 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
