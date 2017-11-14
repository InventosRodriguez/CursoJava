package mgt.segunda.clase;

public enum TipoImc {DESNUTRIDO, BAJOPESO, NORMAL, SOBREPESO, OBESO;

	public static TipoImc traduceIMC (double imc) 
	{
		TipoImc devuelvo = null;
		
			if (imc<16)
				devuelvo = TipoImc.DESNUTRIDO;
			else if (imc>=16 && imc<18.5) 
					devuelvo = TipoImc.BAJOPESO;
				 else if (imc>=18.5 && imc < 25) 
					 	devuelvo = TipoImc.NORMAL;
				 	  else if (imc>=25 && imc < 31) 
				 		  	devuelvo = TipoImc.SOBREPESO;
				 	  else devuelvo = TipoImc.OBESO;
		
		return devuelvo;
	}
}
