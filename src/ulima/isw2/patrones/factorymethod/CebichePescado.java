package ulima.isw2.patrones.factorymethod;

public class CebichePescado implements Cebiche{
	@Override
	public void preparar(){
		System.out.println("Preparando cebiche de pescado");
	}
	
	@Override
	public void cortar(){
		System.out.println("Cortando el pescado");
	}
	
	@Override
	public void servir(){
		System.out.println("El cebiche de pescado se sirve en un plato");
	}
}
