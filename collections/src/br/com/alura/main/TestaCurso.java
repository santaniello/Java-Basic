package br.com.alura.main;

import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		Curso curso = new Curso("Collections", "Paulo Silveira");
		curso.getAulas().add(new Aula("Aula1", 21));
		curso.getAulas().add(new Aula("Aula2", 25));
		curso.getAulas().add(new Aula("Aula3", 19));		
		System.out.println(curso.getAulas());	
		
		curso.getAulas();
		
		
	}
}
