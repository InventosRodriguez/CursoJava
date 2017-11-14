package mgt.novena.clase;

public class MainJdbc2 {
	
	public static void main(String[] args) {
		
		//1. INICIAR LA CONEXION (DRIVER) se hace 1 vez
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			ServicioRegion sr = new ServicioRegion();
			Regions rg = sr.getRegions(1);
			System.out.println(rg);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //le estoy diciendo q voy a utilizar el driver de oracle
				
		
	}

}
