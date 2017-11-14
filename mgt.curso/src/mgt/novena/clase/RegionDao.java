package mgt.novena.clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegionDao {
	
	public Regions getRegionFromBD (int id_region) 
	{
		Regions regions = null; //tengo que definir las variables fuera del try para que existan en todo el metodo
		ResultSet rs = null;  //sino solo existen dentro de unos {} determinados
		Statement st = null;
		Connection conexion = null;
		
		try {
		//Por cada operacion se crea una conexion nueva
		//metemos el connection en cada método del dao
		 conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "soyguay"); 
		
		 st = conexion.createStatement(); 
		
		 rs = st.executeQuery("SELECT * FROM REGIONS WHERE REGION_ID =" + id_region); 
		
		if (rs.next()) //TENGO QUE HACER EL NEXT OBLIGATORIO PARA QUE EL RESULTADO SE CARGUE EN EL OBJETO RS
		{ //COMO AQUI EL RESULTADO ES UNICO, EN VEZ DE WHILE PONGO IF Y YA SE ME POSICIONA EN LA PRIMERA FILA DEVUELTA
			regions = new Regions(rs.getString("REGION_NAME"), rs.getInt("REGION_ID"));
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR AL ACCEDER A LAS REGIONES");
		} finally { //siempre se ejecuta vaya bien o vaya mal el try
					//de esta forma si peta, puedo meter el close de la bbdd
					//el finally lleva su propio try catch
			try {
				rs.close();
				st.close();
				conexion.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ERROR AL LIBERAR RECURSOS");
			}
		}
		
		return regions;
	}

}
