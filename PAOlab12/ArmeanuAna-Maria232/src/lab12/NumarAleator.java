package lab12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumarAleator
 */
@WebServlet("/NumarAleator")
public class NumarAleator extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NumarAleator() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * // TODO Auto-generated method stub
		double nr = Math.random();
		request.getSession().setAttribute("servlet Nr", nr);//cheie(string) si valoare
		Double nrDinServlet = (Double) request.getSession().getAttribute("servlet Nr");
		if(nrDinServlet == null)
			nrDinServlet= 0d;//cast nr la double 
		
		Double nrDinJsp = (Double) request.getSession().getAttribute("JSP Nr");//va fi setat si calculat in JSP
		if(nrDinJsp == null)
			nrDinJsp= 0d;//cast nr la double
		
		response.getWriter().append("Iata un numar: ").append(Double.toString(nrDinServlet));
		response.getWriter().append("Iata alt numar: ").append(Double.toString(nrDinJsp));
		*/
		double nr = Math.random();
		request.setAttribute("Nr", nr);//cheie(string) si valoare
		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);//aici cere si raspunsul
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
