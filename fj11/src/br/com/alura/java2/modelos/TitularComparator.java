package br.com.alura.java2.modelos;

import java.util.Comparator;

public class TitularComparator implements Comparator<Conta> {
	@Override
	public int compare(Conta conta1, Conta conta2) {
		return conta1.getNome().compareTo(conta2.getNome());
	}
}
