package ulima.isw2.patrones.factorymethod;

public class CebicheMixtoChimbotano implements Cebiche{

	@Override
	public void preparar(){
		System.out.println("Preparando cebiche mixto toque Chimbotano");
	}
	
	@Override
	public void cortar(){
		System.out.println("Cortando el pescado, los mariscos y el aji");
	}
	
	@Override
	public void servir(){
		System.out.println("El cebiche mixto Chimbotano se sirve en un plato");
	}

}
