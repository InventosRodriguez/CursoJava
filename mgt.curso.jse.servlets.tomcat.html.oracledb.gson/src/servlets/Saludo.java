package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Saludo
 * http://localhost:8085/mgt.curso.jse.servlets.tomcat.html.oracledb.gson/Saludo?name=alvaro&apell=rodriguez
 */
@WebServlet("/Saludo") //aquí ya le está diciendo la correspondencia
public class Saludo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    //esto se sl mapping (la correspondencia)
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Saludo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request, mensaje http de peticion
		//response, mensaje http de respuesta
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int remote_add = request.getRemotePort();
		System.out.println(remote_add);
		
		String name = request.getParameter("name");
		System.out.println(name);
		String apell = request.getParameter("apell");
		
		String respuesta = "HOLA " + name + " " + apell;
		
		PrintWriter pw = response.getWriter();
		pw.write(respuesta);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
