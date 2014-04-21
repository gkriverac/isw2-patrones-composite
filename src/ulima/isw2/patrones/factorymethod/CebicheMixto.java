package ulima.isw2.patrones.factorymethod;

public class CebicheMixto implements Cebiche{

	@Override
	public void preparar(){
		System.out.println("Preparando cebiche mixto");
	}
	
	@Override
	public void cortar(){
		System.out.println("Cortando el pescado y los mariscos");
	}
	
	@Override
	public void servir(){
		System.out.println("El cebiche mixto se sirve en un plato");
	}

	

}
