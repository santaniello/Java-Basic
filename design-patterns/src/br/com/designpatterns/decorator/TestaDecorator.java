package br.com.designpatterns.decorator;

public class TestaDecorator {
	public static void main(String[] args) {
		System.out.println("Teste");
		Imposto impostoComplexo = new ISS(new ICMS());
		Orcamento orcamento = new Orcamento(500.0);
		double valor = impostoComplexo.calcula(orcamento);
		System.out.println(valor);
	}
}
