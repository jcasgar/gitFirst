package ejemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {

		ArrayList<String> clientes = new ArrayList<>();
		clientes.add("Pepe García");
		clientes.add("Toni Pérez");
		clientes.add("Marta Gómez");
		clientes.add("Sara Martínez");
		clientes.add("Tom Martínez");
		
		Iterator<String> clienteIterator = clientes.iterator();
		
		while (clienteIterator.hasNext())
		{
			String cliente = clienteIterator.next();
			if(cliente.equals("Toni Pérez"))
				clienteIterator.remove();
			System.out.println(cliente);
		}

		while (clienteIterator.hasNext())
		{
			System.out.println("NO ENTRA pq????? ");
			String cliente = clienteIterator.next();
			if(cliente.equals("Toni Pérez"))
				clienteIterator.remove();
			System.out.println(cliente);
		}
		
		
		System.out.println("");
		System.out.println("NUEVO ITERADOR");
		
		clienteIterator = clientes.iterator();
		
		while (clienteIterator.hasNext())
		{
			String cliente = clienteIterator.next();
			System.out.println(""+ cliente);
		}
//		for (String c : clientes) {
//			if (c.equals("Toni Pérez")) {		
//				clientes.remove(c);
//				return;
//			}
//			System.out.println(c);
//		}
		// debería mostrar a todos menos a Toni Pérez, pero muestra
		// Pepe García
		// Toni Pérez
		// ConcurrentModificationException
	}
}
