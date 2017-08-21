package br.com.alura.modelos;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private int tempoTotal;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// Lista não pode ser modificada...
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.tempoTotal += aula.getTempo();
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	@Override
	public String toString() {
		return "Curso [tempoTotal=" + tempoTotal + ", nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas
				+ "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		// Criando um clone do Set que não poderá ser modificado fora da
		// classe... isso é uma boa prática...
		return Collections.unmodifiableSet(this.alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numeroMatricula){
		if(!matriculaParaAluno.containsKey(numeroMatricula))
			throw new NoSuchElementException();
			return matriculaParaAluno.get(numeroMatricula);
	}

}
