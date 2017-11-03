package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.devacademy.IMC;
import edu.devacademy.Persona;
import edu.devacademy.TipoIMC;

/**
 * Servlet implementation class CalcularIMC
 */
@WebServlet("/CalcularIMC")
public class CalcularIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 
     */
    public CalcularIMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * me envian informacion desde un formulario
	 * la información de los formularios casi siempre van con post
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//OBTENER DATOS PERSONA
		String peso = request.getParameter("peso");
		Double i_peso = Double.parseDouble(peso);
		String altura = request.getParameter("altura");
		Double i_altura = Double.parseDouble(altura);
		
		Persona persona = new Persona(i_peso,i_altura);
		
		//CALCULAR IMC
		double imcResultado=IMC.calcula(persona);
		//String mensaje_respuesta= String.valueOf(imcResultado);
		TipoIMC tipo = TipoIMC.traduceIMC(imcResultado);
	
		
		//DEVOLVER EL RESULTADO
		//PrintWriter pw = response.getWriter(); 
		//pw.write(tipo.name());
		request.setAttribute("imc", tipo.name());
		request.getRequestDispatcher("imc.jsp").forward(request, response);

	}

}
