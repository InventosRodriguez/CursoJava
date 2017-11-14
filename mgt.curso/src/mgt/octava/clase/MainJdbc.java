package mgt.octava.clase;

import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJdbc {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//TODO PEQUEÑA APP PARA LEER TODAS LAS REGIONES DEL ESQUEMA HR
		
		//1. INICIAR LA CONEXION (DRIVER) se hace 1 vez
		Class.forName("oracle.jdbc.driver.OracleDriver"); //le estoy diciendo q voy a utilizar el driver de oracle
		
		//2. LANZAR LA CONSULTA
		Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "soyguay"); //ya tengo la conexion a la bbdd
		Statement st = conexion.createStatement(); //creo un objeto statement, que me permite crear la query
		
		ResultSet rs = st.executeQuery("SELECT * FROM REGIONS"); //rs contendrá el resultado de la query

		
		//3. MOSTRAR LOS DATOS (LISTA-REGIONES)
		Regions rg = null;
		List<Regions> lista_regiones = new LinkedList<Regions>();
		
		while (rs.next()) //aquí me recorro el resulset y guardo la información recuperada en rs en un objeto tipo LinkedList
		{
			rg = new Regions(rs.getString("REGION_NAME"), rs.getInt("REGION_ID"));
			lista_regiones.add(rg);
			System.out.println(rg.toString());
		}
		
		//4. LIBERAR RECURSOS en este orden!!!!!
		rs.close(); //cierro el resulset
		st.close(); //cierro el statement
		conexion.close(); //cierro la conexion
	}
}
