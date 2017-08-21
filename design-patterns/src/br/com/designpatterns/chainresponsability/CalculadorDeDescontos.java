package br.com.designpatterns.chainresponsability;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        // passando o próximo desconto caso o atual não seja satisfeito...
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		return d1.desconta(orcamento);
	}
}
