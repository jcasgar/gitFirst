package ejemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EjemploColeccion {

	public static void main(String[] args) {

		LinkedList<Alumno> dam = new LinkedList<>();
		// métodos interface Collection
		dam.add(new Alumno("Pep", "222A", 25));
		dam.add(new Alumno("Tom", "111A", 20));
		dam.add(new Alumno("Jon", "444A", 21));
		dam.add(new Alumno("Tim", "333A", 19));
		dam.add(new Alumno("Ada", "555A", 18));
		dam.add(new Alumno("Sam", "666A", 18));
		// métodos interface List
		dam.set(2, new Alumno("Ana", "777A", 20));
		dam.add(2, new Alumno("Bil", "777A", 20));
		// métodos interfaces Queue y Deque
		dam.pollFirst();
		dam.pollLast();
		dam.offerFirst(new Alumno("Jud", "888A", 24));
		dam.offerLast(new Alumno("Kim", "999A", 28));

		System.out.println(dam.removeFirst());
		System.out.println(dam.removeLast());

		Set<Integer> nums = new HashSet<>();
		nums.add(5);
		nums.add(8);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		System.out.println(nums); // [2, 3, 4, 5, 8]
		System.out.println(nums.contains(1)); // false

		List<Integer> nums1 = new ArrayList<>();
		nums1.add(5);
		nums1.add(8);
		nums1.add(2);
		nums1.add(3);
		nums1.add(3);
		nums1.add(4);
		nums1.add(5);
		System.out.println(nums1); // [5, 8, 2, 3, 3, 4, 5]
		Set<Integer> nums2 = new HashSet<>(nums1);
		System.out.println(nums2); // [2, 3, 4, 5, 8]

		Set<String> nombres = new HashSet<>();
		nombres.add("Pep");
		nombres.add("Tom");
		nombres.add("Jon");
		nombres.add("Pep");
		nombres.add("Kal");
		nombres.add("Tom");
		System.out.println(nombres); // [Tom, Kal, Jon, Pep]
		nombres.remove(2); // no borra ningún nombre
		nombres.remove("Tom"); // [Kal, Jon, Pep]
		// nombres.get(2); // ERROR, no tenemos el método get

		Set<Alumno> dam1 = new HashSet<>();
		Alumno a1 = new Alumno("Pep", "222A", 25);
		Alumno a2 = new Alumno("Sam", "666A", 18);
		Alumno a3 = new Alumno("Sam", "666A", 18);
		Alumno a4 = new Alumno("Kal", "666A", 20);

		dam1.add(a1); // Pep
		dam1.add(a2); // Pep, Sam
		dam1.add(a3); // Pep, Sam, No se añade mismo nia
		dam1.add(a4); // Pep, Sam, No se añade mismo nia

		dam1.add(a1); // No se inserta Pep, tienen la misma referencia
		dam1.add(new Alumno("Sam", "666A", 18)); // NO Se inserta Sam, tienen la misma referencia

		Iterator<Alumno> iteratorAlumnos = dam1.iterator();
		while (iteratorAlumnos.hasNext()) {
			System.out.println(iteratorAlumnos.next().toString());
		}

		Map<Character, Integer> letras1 = new HashMap<>();
		Map<String, Integer> palabras = new HashMap<>();
		Map<Alumno, Double> notasPrg = new LinkedHashMap<>();
		Map<Alumno, ArrayList<Double>> notasDam = new TreeMap<>();
		// Map<Alumno, ArrayList<Calificacion>> notasDam = new TreeMap<>();

		Map<String, Double> notasDeAlumnos = new HashMap<>();
		// Añadimos las notas de los alumnos
		notasDeAlumnos.put("Tim", 9.7);
		notasDeAlumnos.put("Bob", 8.5);
		notasDeAlumnos.put("Jon", 7.8);
		notasDeAlumnos.put("Bob", 8.8);
		notasDeAlumnos.put("Bob", notasDeAlumnos.getOrDefault("Bob", 0.0) + 1); // Bob → 9.8
		notasDeAlumnos.put("Jon", notasDeAlumnos.getOrDefault("Kal", 5.0) + 1); // Jon → 6.0
		notasDeAlumnos.put("Kal", notasDeAlumnos.getOrDefault("Bob", 5.0)); // Kal → 9.8
		notasDeAlumnos.put("Kal", notasDeAlumnos.getOrDefault("Sam", 0.0)); // Kal → 0.0
		// Mostramos datos con entrySet()
		System.out.println("Notas alumnos:");
		for (Map.Entry<String, Double> pares : notasDeAlumnos.entrySet()) {
			System.out.println("La nota de " + pares.getKey() + " es " + pares.getValue());
		}
		// Mostramos nombres de los alumnos con keySet() y nota media
		System.out.println("Alumnos:" + notasDeAlumnos.keySet()); // Alumnos:[Bob, Kal, Jon, Tim]
		double sumaNotas = 0;
		for (Double nota : notasDeAlumnos.values())
			sumaNotas += nota;
		System.out.println("Nota media: " + sumaNotas / notasDeAlumnos.size()); // Nota media: 6.375

		String s = "Cadena de ejemplo!!\nHoy es miércoles día 29 de marzo de 2023\n\nFIN";
		// Utilizamos HashMap para almacenar los caracteres y sus frecuencias
		Map<Character, Integer> letras = new HashMap<>();
		// Convertimos la cadena de entrada a minúsculas y la recorremos
		for (char letra : s.toLowerCase().toCharArray()) {
			// Verificamos si el carácter es una letra
			if (Character.isLetter(letra)) {
				// Incrementamos la frecuencia del carácter en el mapa, o lo iniciamos a 0
				letras.put(letra, letras.getOrDefault(letra, 0) + 1);
			}
		}
		// Mostramos los resultados
		System.out.println("Frecuencia de caracteres en la cadena de entrada:");
		for (Map.Entry<Character, Integer> claveValor : letras.entrySet()) {
			System.out.println(claveValor.getKey() + ": " + claveValor.getValue());
		}

		String s1 = "Cadena de ejemplo!!\nHoy es miércoles día 29 de marzo de 2023\n\nFIN";
		
		// Utilizamos HashMap para almacenar las palabras y sus frecuencias
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		// Convertimos a minúsculas y dividimos la cadena en palabras con split
		String[] palabras1 = s1.toLowerCase().split("\\s+");
		// Recorremos el array de palabras
		for (String palabra : palabras1) {
			// Incrementamos la frecuencia de la palabra en el mapa
			frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
		}
		// Imprimimos los resultados
		System.out.println("Frecuencia de palabras en la cadena de entrada:");
		for (Map.Entry<String, Integer> claveValor : frecuenciaPalabras.entrySet()) {
			System.out.println(claveValor.getKey() + ": " + claveValor.getValue());
		}

	}

}
