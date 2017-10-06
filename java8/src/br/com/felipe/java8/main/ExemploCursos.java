package br.com.felipe.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {
	private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }    
}

public class ExemploCursos{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// Usando Stream Stream para trabalhar com listas
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println(x));	
		
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   //.mapToInt(Curso::getAlunos)
				   .mapToInt((Curso c) -> c.getAlunos())
				   .sum();
		
		OptionalDouble average = cursos.stream()
				    .mapToInt((Curso c) -> c.getAlunos())
				    .average();		
		
		System.out.println(average);
		
		// convertendo um stream em uma lista...
		List<Curso> collect = cursos.stream()
			  .filter(c -> c.getAlunos() > 50)
			  .collect(Collectors.toList());
		
		
	}	
}

