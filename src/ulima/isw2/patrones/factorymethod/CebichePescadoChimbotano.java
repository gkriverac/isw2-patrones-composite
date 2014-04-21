package ulima.isw2.patrones.factorymethod;

public class CebichePescadoChimbotano implements Cebiche{
	@Override
	public void preparar(){
		System.out.println("Preparando cebiche de pescado al estilo chimbotano");
	}
	
	@Override
	public void cortar(){
		System.out.println("Cortando el pescado y poniendole harto aji");
	}
	
	@Override
	public void servir(){
		System.out.println("El cebiche chimbotano de pescado se sirve en un plato");
	}
}
