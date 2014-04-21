package ulima.isw2.patrones.factorymethod;

/*
 * 1. Se crean el metodo ordenarCebiche() y solamente la clase Cebiche
 * 2. Se convierte Cebiche a una interface y en el metodo ordenarCebiche() se le aumenta el
 *    parametro tipo (junto con la sentencia switch).
 * 3. Que pasa si quiero aumentar un tipo de cebiche? Tendr’a que cambiar el codigo del
 *    metodo ordenarCebiche. Por lo tanto, este metodo no est‡ cerrado a modificaciones.
 *    Se sacar‡ ese c—digo y se proceder‡ a crear una clase Factory
 * 4. Ordenamos mas el codigo, creamos la clase RestauranteCebicheria que es la que expone
 *    el metodo ordenarCebiche().
 * 5. Nos comenzamos a ocupar de los otros restaurantes. Cada restaurante, prepara un tipo
 *    distinto de Cebiche (a nivel de sabor y uso de ingredientes). Volvemos la clase 
 *    RestauranteCebicheria abstracta.
 * 
 */

public class CebicheriaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SimpleCebicheFactory factory = new SimpleCebicheFactory(); 
		RestauranteCebicheria restauranteLima = new RestauranteCebicheriaLima();
		RestauranteCebicheria restauranteChimbote = new RestauranteCebicheriaChimbote();
	
		restauranteLima.ordenarCebiche(RestauranteCebicheria.PESCADO);
		restauranteLima.ordenarCebiche(RestauranteCebicheria.MIXTO);
		restauranteChimbote.ordenarCebiche(RestauranteCebicheria.PESCADO);
		restauranteChimbote.ordenarCebiche(RestauranteCebicheria.MIXTO);
		
	}

}
