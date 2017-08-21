package br.com.alura.java2.main;

import br.com.alura.java2.modelos.Conta;
import br.com.alura.java2.modelos.ContaCorrente;
import br.com.alura.java2.modelos.ContaPoupanca;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.setNumero(1);
		cc.setNome("Felipe");
		
		cp.setNumero(2);
		cp.setNome("Felipe");
			      
        System.out.println("As contas são equivalentes ? " + cc.equals(cp));
        System.out.println("As contas são o mesmo objeto ? "+ (cc == cp));
        
        String teste = "Socorram-me, subi no ônibus em Marrocos";
        
        for (int i = teste.length() -1; i >= 0; i--) {
			System.out.print(teste.charAt(i));
		}
	}
}
