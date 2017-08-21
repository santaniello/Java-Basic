package br.com.alura.java2.main;

import br.com.alura.java2.modelos.Conta;
import br.com.alura.java2.modelos.ContaCorrente;

public class TestaJavaLang {	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
	    System.out.println(conta);
	}

}
