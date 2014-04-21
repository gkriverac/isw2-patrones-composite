package ulima.isw2.patrones.models;

@SuppressWarnings("unused")
public class Persona {
	
	public static String profesion;
	private String nombre;
	private int edad;
	
	public void irAlTrabajo(){
		IVehiculo automovil = new Automovil();
		automovil.arrancar();
	}
	
	public static String[] getEstadosCiviles(){
		String[] estadosCiviles = new String[]{
			"SOLTERO",
			"CASADO",
			"VIUDO",
			"DIVORCIADO"
		};
		
		return estadosCiviles;
	}
}
