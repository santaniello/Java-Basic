package br.com.designpatterns.chainresponsability;

public class DescontoPorMaisDeCincoItens implements Desconto {
	
    private Desconto proximo;
	
    @Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			// chamando o próximo desconto caso o atual não seja satisfeito...
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;		
	}
}
