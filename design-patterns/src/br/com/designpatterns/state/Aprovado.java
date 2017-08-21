package br.com.designpatterns.state;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	public void aprova(Orcamento orcamento) {
		// jah estou em aprovacao
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}
}
