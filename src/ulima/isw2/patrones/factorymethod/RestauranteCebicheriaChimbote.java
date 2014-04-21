package ulima.isw2.patrones.factorymethod;

public class RestauranteCebicheriaChimbote extends RestauranteCebicheria{

	@Override
	public Cebiche crearCebiche(int tipo) {
		Cebiche cebiche = null;
		switch (tipo){
			case 1: cebiche = new CebichePescadoChimbotano();
			break;
			case 2: cebiche = new CebicheMixtoChimbotano();
			break;
	
		}
		return cebiche;
	}

}
