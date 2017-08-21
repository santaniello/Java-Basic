package br.com.solid.ocpdip.comrefatoracao;

public class Teste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
        ServicoDeEntrega entrega = new Frete();
        CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
	}

}
