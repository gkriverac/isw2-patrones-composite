package ulima.isw2.patrones.observer;

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boton boton1 = new Boton(1);
		Boton boton2 = new Boton(2);
		
		Controlador controlador = new Controlador(boton1, boton2);
		
		boton1.onClick();
		boton2.onClick();
	}

}
