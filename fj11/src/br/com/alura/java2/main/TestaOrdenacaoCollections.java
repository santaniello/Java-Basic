package br.com.alura.java2.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.java2.modelos.ContaPoupanca;
import br.com.alura.java2.modelos.TitularComparator;

public class TestaOrdenacaoCollections {	
	public static void main(String[] args) {
		ContaPoupanca cc = new ContaPoupanca();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.setNumero(2);
		cc.setNome("Felipe");
		
		cp.setNumero(1);
		cp.setNome("Pamela");
		
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		contas.add(cc);
		contas.add(cp);
		
		
		System.out.println("Ordenando pelo numero da conta usando compareTo...");
		
		Collections.sort(contas);
					
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println("Titular = " + contaPoupanca.getNome() + " -  Numero da conta = " + contaPoupanca.getNumero());
		}
		
		
		// Foi criado um comparator para ordenar pelo nome do titular da conta
		// Exemplo retirado do artigo http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
		TitularComparator comparator = new TitularComparator();
		
		Collections.sort(contas,comparator);
		
		System.out.println("Usando comparator e ordenando pelo nome do titular...");
		
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println("Titular = " + contaPoupanca.getNome() + " -  Numero da conta = " + contaPoupanca.getNumero());
		}
       
	}

}
