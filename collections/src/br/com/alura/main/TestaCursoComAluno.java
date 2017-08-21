package br.com.alura.main;

import br.com.alura.modelos.Aluno;
import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Rodrigo Turini", 34672);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		
		System.out.println("Todos os alunos matriculados: ");
		
		// USando lambda para exibir os dados (Opcional pois existe apenas no Java 8)
		javaColecoes.getAlunos().forEach(aluno -> {
		    System.out.println(aluno);
		});
		
		// testando o uso do hashCode e do equals...
		System.out.println(javaColecoes.estaMatriculado(a4));
		

	}

}
