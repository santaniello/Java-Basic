package br.com.alura.main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.modelos.Funcionario;
import br.com.alura.modelos.IdadeFuncionarioComparator;

public class TestaTreeSet {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Barney", 12);
		Funcionario f2 = new Funcionario("Jonatan", 9);
		Funcionario f3 = new Funcionario("Guaraciara", 13);

		// Passando um comparator que ordena de acordo com a idade do funcionário...		
		Set<Funcionario> funcionarios = new TreeSet<>(new IdadeFuncionarioComparator());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> iterador = funcionarios.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}

	}

}
