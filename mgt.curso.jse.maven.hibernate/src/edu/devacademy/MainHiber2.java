package edu.devacademy;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cache.spi.Region;
import org.hibernate.cfg.Configuration;


public class MainHiber2
{
	
	/*******************************************************
	 * 
	 * EJEMPLO B�sico del Uso de HIBERNATE
	 * 
	 * Todo lo que hasta hora est�bamos metiendo en el paquete "DAO", es lo que va a englobar y encargarse de ello
	 * el conjunto de bibliotecas que representa Hibernate
	 * 
	 * 		- Las conexiones ( y la concurrencia entra ellas )
	 * 		- La comunicaci�n con la base de datos (ejecuci�n de consultas SQL)
	 * 		- La escritura de POJOS o DTO's (para persistir clases en la base de datos)
	 * 		- La recuperaci�n de registros en DTO's (para recuperar filas y pasarlas a clases Java)
	 * 		- El manejo de las transacciones (Para gestionar adecuadamente la interacci�n con la BD, salvaguardadno la integridad)
	 * 
	 * 
	 * */
	
	
    public static void main(String args[]){
    	
    	//Cargo la configuraci�n: MAPPING entre Tablas y Objetos as� como La descripci�n de la base de de datos
    	//Dicho de otra forma: cargamos en memoria en la clase Configuration el hibernate.cfg.xml
    	Configuration configuration = new Configuration().configure();
    	configuration.addAnnotatedClass(Regions.class);
    	//Preparo a un objeto, que ser� el encargado de generarme el estado de comunicaci�n con la base de datos
    	//StandardServiceRegistryBuilder se preconfigura el entorno a emplear
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	
    	//Ahora s�, obtengo el objeto SessionFactory, a partir de la anterior clase /servicio
    	//que ya es la clase que encapsula al Pool y dem�s recursos f�sicos
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	
    	//Ahora ya con sesion, obtengo y manejo conexiones que me va dando SessionFactory
    	Session session = factory.openSession();
    	
    	  	
    	Transaction transaction = null;
    	//Y procedo a guardarlo --> INICIO DE LA TRANSACCION
    	try 
    	{
    		transaction = session.beginTransaction();
    		Regions r = session.get(Regions.class, new BigDecimal(850)); //aqu� estoy haciendo la select where region_id=850
    		//r.setRegionName("Alcobendas city"); esto hace update
    		System.out.println(r.getRegionName() + " " + r.getRegionId());
    		transaction.commit();//si todo ha ido bien, persisto los cambio, los hago de verdad, no en la copia de la BD
    	}
    	catch (Exception e)
    	{
    		transaction.rollback();//si algo ha ido mal, deshago la transacci�n
    	}
    	
    	finally 
    	{
    		session.close();//haya ido bien o mal, libero recursos!
    		factory.close();
    	}
    }
}