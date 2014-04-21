package ulima.isw2.patrones.factorymethod;

public abstract class RestauranteCebicheria {
	public static final int PESCADO =1;
	public static final int MIXTO = 2;
	
	public abstract Cebiche crearCebiche(int tipo);
	
	public Cebiche ordenarCebiche(int tipo){
		Cebiche cebiche = crearCebiche(tipo);
		
		cebiche.preparar();
		cebiche.cortar();
		cebiche.servir();
		
		return cebiche;
	}
}
