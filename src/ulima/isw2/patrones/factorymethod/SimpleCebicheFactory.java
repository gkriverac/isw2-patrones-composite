package ulima.isw2.patrones.factorymethod;

public class SimpleCebicheFactory {
	
	public Cebiche crearCebiche(int tipo){
		Cebiche cebiche = null;
		switch (tipo){
			case 1: cebiche = new CebichePescado();
			break;
			case 2: cebiche = new CebicheMixto();
			break;
	
		}
		return cebiche;
	}
}
