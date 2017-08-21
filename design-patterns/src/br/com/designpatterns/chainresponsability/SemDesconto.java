package br.com.designpatterns.chainresponsability;

/**
 * Classe usada para terminar a corrente...
 * 
 * */
public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		  // não tem próximo pois é o fim da corrente...
	}

}
