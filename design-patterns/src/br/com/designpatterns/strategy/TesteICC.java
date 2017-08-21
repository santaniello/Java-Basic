package br.com.designpatterns.strategy;

public class TesteICC {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		Imposto novoImposto = new ICCC();
		System.out.println(novoImposto.calcula(reforma));
	}
}
