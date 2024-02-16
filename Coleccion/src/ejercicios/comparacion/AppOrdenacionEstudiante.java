package ejercicios.comparacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AppOrdenacionEstudiante {

	
	public static void main(String[] args) {
		
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		listaEstudiantes.add(new Estudiante("Carlos", 19, 3));
		listaEstudiantes.add(new Estudiante("Felipe", 21, 1));
		listaEstudiantes.add(new Estudiante("Ana", 18, 4));
		listaEstudiantes.add(new Estudiante("Rosa", 15, 1));
		listaEstudiantes.add(new Estudiante("Jose", 10, 2));
		
		System.out.println("Estuidiantes sin orden \n" + listaEstudiantes);
		
		listaEstudiantes.toString();
		
		Collections.sort(listaEstudiantes);
		
		System.out.println("Estuidiantes ordenados por Nombre \n" + listaEstudiantes);
		
		listaEstudiantes.toString();
				
		Collections.sort(listaEstudiantes, new OrdenEstudiantePorEdad());
		
		System.out.println("Estuidiantes ordenados por Edad \n" + listaEstudiantes);
		
		listaEstudiantes.toString();
		
		//TODO ordenar por Curso
		
	}
}
