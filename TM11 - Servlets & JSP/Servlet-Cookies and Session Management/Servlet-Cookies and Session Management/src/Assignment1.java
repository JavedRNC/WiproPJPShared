

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Assignment1
 */
@WebServlet("/Assignment1")
public class Assignment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int i=0,j=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    
	    HttpSession session=request.getSession(false);
	    String name=(String)request.getParameter("name");
	    int c=0;
	    for(int k=0;k<j;k++)
	    {
	    	if(session.getAttribute("name"+(k)).equals(name))
	    		c++;
	    	
	    		
	    }
	    
	    session.setAttribute("name"+(j++), name);
	    
	    PrintWriter out=response.getWriter();
	    if(c==0 )
	    {
	    	
	    	out.println("Welcome "+name+", you are visiting for the first time");
	    }
	    else
	    {
	    	out.println("Welcome Back");
	 	   	
	    }
	    i++;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
