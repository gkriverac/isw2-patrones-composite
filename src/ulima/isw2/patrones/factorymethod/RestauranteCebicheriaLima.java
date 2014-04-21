package ulima.isw2.patrones.factorymethod;

public class RestauranteCebicheriaLima extends RestauranteCebicheria{

	@Override
	public Cebiche crearCebiche(int tipo) {
		Cebiche cebiche = null;
		
		switch(tipo){
			case PESCADO:
			cebiche = new CebichePescado();
			break;
			case MIXTO:
				cebiche = new CebicheMixto();
			break;
		}
		
		return cebiche;
	}

}
