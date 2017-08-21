package br.com.alura.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.modelos.Aula;
import br.com.alura.modelos.TempoComparator;

public class TestandoListaAulas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		Collections.sort(aulas);

		System.out.println("Comparando usando a interface Comparable");
		System.out.println(aulas);
		
		// Usando o comparator no Java 8 !!! 
		System.out.println("\n Comparando com o comparator do Java 8");
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		System.out.println("\n Comparando com o comparator normal (Java 7 ou menor)");
		Collections.sort(aulas, new TempoComparator());
		System.out.println(aulas);
		
		
	}

}
