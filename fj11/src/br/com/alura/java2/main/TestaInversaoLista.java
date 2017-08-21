package br.com.alura.java2.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.java2.modelos.ContaPoupanca;
import br.com.alura.java2.modelos.TitularComparator;

public class TestaInversaoLista {	
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
				
		System.out.println("Invertendo a ordem da lista com reverse...");
		
		Collections.reverse(contas);
					
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println("Titular = " + contaPoupanca.getNome() + " -  Numero da conta = " + contaPoupanca.getNumero());
		}
		
		
		Collections.shuffle(contas);
		
		System.out.println("Randomizando os elementos da lista com shuffle...");
		
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println("Titular = " + contaPoupanca.getNome() + " -  Numero da conta = " + contaPoupanca.getNumero());
		}
		
		Collections.rotate(contas.subList(0, 1),1);
		
		System.out.println("Rotacionando os elementos de uma lista com rotate...");
		
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println("Titular = " + contaPoupanca.getNome() + " -  Numero da conta = " + contaPoupanca.getNumero());
		}
		
		
		System.out.println(contas);
		
		
       
	}

}
