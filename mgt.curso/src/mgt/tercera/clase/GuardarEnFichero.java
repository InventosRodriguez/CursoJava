package mgt.tercera.clase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarEnFichero {
	
	public static void MeterEnCaja(Cerveza[] array_cervezas, String nomfichero) {
		
		// Cremos un objeto de tipo File donde asociamos el nombre de fichero para instanciarlo con el fichero físico
		File o_file = new File(nomfichero);
		
		if (!o_file.exists()) {
			try {
				//Si no existe lo crea
				o_file.createNewFile();
				
				//Instanciamos un objeto de tipo Filewriter que servirá de enlace con nuestro fichero
				FileWriter fw = new FileWriter(o_file);
				
				// Instanciamos un objeto propio, en este caso el write
				BufferedWriter bw = new BufferedWriter(fw);
				
				// Recorremos el arrat y escribimos. Usamos el tostring pa convertir en caractares. Si no lo usaremos guardariamos unicamente espaciosde  memoria con un cnombre muy chungo
				for (int i=0; i < array_cervezas.length; i++) {
					
					bw.write(array_cervezas[i].toString());	
					// Creamos linea nueva
					bw.newLine();
				}
				
				//Cerramos fichero
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
