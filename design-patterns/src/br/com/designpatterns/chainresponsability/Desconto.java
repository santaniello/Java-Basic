package br.com.designpatterns.chainresponsability;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
