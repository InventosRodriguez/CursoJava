package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;



/**
 * Servlet implementation class DameRegion
 */
@WebServlet("/DameRegion")
public class DameRegion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * //http://localhost:8085/mgt.curso.jse.servlets.tomcat.html.oracledb.gson/ServicioRegion?idregion=1
     * @see HttpServlet#HttpServlet()
     */
    public DameRegion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//1. obtener id de la url (peticion)
		String id_region = request.getParameter("idregion"); //recojo el parametro
		//casting de string a entero
		int nregion = Integer.parseInt(id_region); //paso de string a int
		
		
		//2.llamamos al servicio region
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ServicioRegion sr = new ServicioRegion();
		Regions rg = sr.getRegions(nregion);
		String mensaje_respuesta = null;
		
		if (rg == null)
		{
			mensaje_respuesta = "NO HAY REGION CON ESE ID";
		} else {
			Gson gs = new Gson(); //creo el objeto de tipo gson
			String mensaje_json = gs.toJson(rg); //me convierte un objeto de java en un Json
												//la respuesta es JSON {"nombre":"Europe","id":1}
			System.out.println("JSON " + mensaje_json);
			
			//mensaje_respuesta = rg.toString();
			mensaje_respuesta = mensaje_json;
		}
		
		response.setContentType("application/json"); //le indico que ahora response voy a devolver un json
		PrintWriter pw = response.getWriter(); //mando la respuesta
		pw.write(mensaje_respuesta);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
