package br.com.solid.ocpdip.comrefatoracao;

import br.com.solid.ocpdip.semrefatoracao.Compra;

public class CalculadoraDePrecos {
	
	private TabelaDePreco    tabela;
	private ServicoDeEntrega entrega;
	
	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		super();
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}
