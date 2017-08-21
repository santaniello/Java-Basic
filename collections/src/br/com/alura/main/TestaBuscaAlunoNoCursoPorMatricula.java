package br.com.alura.main;

import br.com.alura.modelos.Aluno;
import br.com.alura.modelos.Curso;

public class TestaBuscaAlunoNoCursoPorMatricula {
	public static void main(String[] args) {
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);

		Curso javaColecoes = new Curso("Coleções", "Paulo Silveira");
		
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a4);

		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
	}
}
