package br.com.alura.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

public class TestaCurso2 {	
	public static void main(String[] args) {
		 Curso javaColecoes = new Curso("Dominando as colecoes do Java","Paulo Silveira");
 
		 javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	     javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	     javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
	     
	     List<Aula> aulasImutaveis = javaColecoes.getAulas();
	     System.out.println(aulasImutaveis);
	     
	 
	     System.out.println(aulasImutaveis);
	     
	     // Fazendo um clone da lista imutavel para podermos ordenar a mesma...
	     List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
	     
	     Collections.sort(aulas);
	     
	     System.out.println(aulas);
	}
}
