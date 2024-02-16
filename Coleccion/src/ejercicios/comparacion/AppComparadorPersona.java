package ejercicios.comparacion;

public class AppComparadorPersona {

	private static Persona[] persona = new Persona[5];
	
	public static void main(String[] args) {

		//Persona[] persona = new Persona[5];

		persona[0] = new Persona("Mario", 187, 22);
		persona[1] = new Persona("Pepe", 176, 52);
		persona[2] = new Persona("Manuel", 158, 27);
		persona[3] = new Persona("David", 164, 25);
		persona[4] = new Persona("Alberto", 184, 80);

		System.out.println("Array desordenado");

		for (int i = 0; i < persona.length; i++) {
			System.out.println(persona[i]);
		}

		System.out.println("Array ordenado por altura");
		ordenacion(persona, "Altura");

		for (int i = 0; i < persona.length; i++) {
			System.out.println(persona[i]);
		}
		
		System.out.println("Array ordenado por edad");
		ordenacion(persona, "Edad"); 
		
		for (int i = 0; i < persona.length; i++) {
			System.out.println(persona[i]);
		}
	}

	public static void ordenacion(Persona[] array, String compararPor) {

		Persona[] temp = new Persona[5];

		if (compararPor.equals("Altura")) {

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < i; j++) {
					if (array[i].compareToPersona(array[i], compararPor) > 0) {
						temp[0] = array[j];
						array[j] = array[i];
						array[i] = temp[0];
					}

				}

			}
		}
		
		if (compararPor.equals("Edad")) {

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < i; j++) {
					if (array[i].compareToPersona(array[i], compararPor) < 0) {
						temp[0] = array[j];
						array[j] = array[i];
						array[i] = temp[0];
					}

				}

			}
		}
	}

}
