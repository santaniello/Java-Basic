package br.com.solid.herancaecomposicao.semrefatoracao;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {
	public static void main(String[] args) {
		List<ContaComum> contasDoBanco = new ArrayList<>();

		for (ContaComum conta : contasDoBanco) {
			conta.rende();

			System.out.println("Novo Saldo:");
			System.out.println(conta.getSaldo());
		}
	}
}
