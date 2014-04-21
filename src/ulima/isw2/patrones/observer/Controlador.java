package ulima.isw2.patrones.observer;

public class Controlador implements OnClickListener{
	Boton mBoton1;
	Boton mBoton2;
	
	public Controlador(Boton boton1, Boton boton2) {
		mBoton1 = boton1;
		mBoton2 = boton2;
		
		boton1.setOnClickListener(this);
		boton2.setOnClickListener(this);
	}

	@Override
	public void onClick(int id) {
		System.out.println("Se ha notificado que se ha hecho click en el boton " + id);
	}
}
