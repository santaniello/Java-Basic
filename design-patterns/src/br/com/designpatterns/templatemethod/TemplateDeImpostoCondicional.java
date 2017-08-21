package br.com.designpatterns.templatemethod;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	/*
	 *  Com o modificador final, os filhos não conseguirão sobrescrever 
	 *  o método template da classe pai. Esse tipo de alteração é muito 
	 *  comum em implementações de Template Method.
	 */	
	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

}
