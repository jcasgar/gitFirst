package ejercicios.iterator;

import java.util.Iterator;

public class GruposDeAvesZoos implements Iterable<AvesEnZoo> {
	
	public AvesEnZoo[] grupoAvesEnZoo;

	public GruposDeAvesZoos(AvesEnZoo[] grupoAvesEnZoo) {
		this.grupoAvesEnZoo = grupoAvesEnZoo;
	}

	
	public Iterator<AvesEnZoo> iterator() {
		
		return new IteratorAvesEnZoo();
	}
	
	
	protected class IteratorAvesEnZoo implements Iterator<AvesEnZoo>{
		
		protected int posicion = 0;
		
		public IteratorAvesEnZoo() {
			posicion = 0;
		}
		
		/**
		 * Un método next() que devuelve el siguiente elemento dentro de la colección
		 */
		public AvesEnZoo next()
		{
			posicion ++;
			return grupoAvesEnZoo[posicion-1];
		}
		
		
		/**
		 * Un método hasNext() que devuelve un tipo booleano,comprobamos si nuestro índice posicionarray
		 ha llegado al final de la colección verificando si su valor ha alcanzado el número máximo de elementos *
		  posible
		 */
		
		public boolean hasNext() {
			boolean resultado;
			if(posicion < grupoAvesEnZoo.length)
				resultado = true;
			else
				resultado = false;
		
			return resultado;
		}
		
		
		
		
		
	}
}
