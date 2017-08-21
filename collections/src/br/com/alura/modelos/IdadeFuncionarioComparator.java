package br.com.alura.modelos;

import java.util.Comparator;

public class IdadeFuncionarioComparator implements Comparator<Funcionario> {
	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		if(f1.getIdade() > f2.getIdade()){
			return 1;
		}
		if(f1.getIdade() < f2.getIdade()){
			return -1;
		}
		return 0;		
	}
}
