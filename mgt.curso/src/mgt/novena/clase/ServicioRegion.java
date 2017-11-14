package mgt.novena.clase;


public class ServicioRegion {
	
	//aqui van las operaciones que puedo realizar sobre la Region
	public Regions getRegions (int id_region) 
	{
		Regions region = null;
		//TODO consultar la base de datos
		RegionDao rgdao = new RegionDao();
		region = rgdao.getRegionFromBD(id_region);
		
		return region;
	}
}
