


	import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Assignment3
 */
@WebServlet("/Assignment3")
public class Assignment3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public  Assignment3() {
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
		    int c=0,val=0;
		    for(int k=0;k<j;k++)
		    {
		    	if(session.getAttribute("name"+(k)).equals(name))
		    	{
		    		
		    		c++;
		    		 // System.out.println(session.getAttribute("name"+(k)));
			    		
		    		  val=(Integer)((session.getAttribute("value"+(k) )));	
		    		  //System.out.println(val);
		    		  session.setAttribute("value"+(k), val+1);
		    		  
		    	}
		    		
//		    	else {
//		    
//		    session.setAttribute("name"+(j++), name);
//		    session.setAttribute("value"+(j++), 1);
//		    	}
		    }
		    PrintWriter out=response.getWriter();
		    if(c==0 )
		    {
		    	 session.setAttribute("name"+(j), name);
				    session.setAttribute("value"+(j), 1);
				   j++;
		    	out.println("Welcome "+name+", you are visiting for the first time");
		    }
		    else
		    {
		    	out.println("Welcome "+name+", you visited "+(val+1)+" times");
		 	   	
		    }
		    i++;
		    out.println("<br><br><br>Session Details:<br>");
		    out.println("Session ID: " + session.getId()+"<br>");
		    out.println("Creation Time: " + new Date(session.getCreationTime())+"<br>");
		    out. println("Last Accessed Time: " + new Date(session.getLastAccessedTime())+"<br>");
		    
		    
		}


	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
