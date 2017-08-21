package br.com.alura.java2.main;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.java2.modelos.Conta;
import br.com.alura.java2.modelos.ContaCorrente;
import br.com.alura.java2.modelos.ContaPoupanca;

public class TestaHashSet {

	public static void main(String[] args) {
		
		Conta cc = new ContaPoupanca();
		Conta cp = new ContaPoupanca();
		Conta cr = new ContaPoupanca();
		
		cc.setNumero(2);
		cc.setNome("Felipe");
		
		cp.setNumero(1);
		cp.setNome("Pamela");
		
		cr.setNumero(1);
		cr.setNome("Pamela");
		
		
		Set<Conta> contas = new HashSet<Conta>();
		
		contas.add(cc);
		contas.add(cp);
		contas.add(cr);
		
				
		for (Conta conta : contas) {
			System.out.println(conta.getNumero());
		}
	}

}
