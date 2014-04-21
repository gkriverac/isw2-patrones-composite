package ulima.isw2.patrones.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ClienteTest {

	public static void main(String[] args) {
		Vector<String> listaCadenasDeTextoLegacy = new Vector<String>();
		
		listaCadenasDeTextoLegacy.add("Lunes");
		listaCadenasDeTextoLegacy.add("Martes");
		listaCadenasDeTextoLegacy.add("Miercoles");
		
		
		Enumeration enumeration = listaCadenasDeTextoLegacy.elements();
		
		Iterator adapter = new EnumerationIteratorAdapter(enumeration);
		
		ClienteTest.pintarElementos(adapter);
	}
	
	// Nuevo método en nuevas versiones de Java
	public static void pintarElementos(Iterator iterator){
		while (iterator.hasNext()){
			System.out.println("Element: " + iterator.next());
		}
	}
	
}
