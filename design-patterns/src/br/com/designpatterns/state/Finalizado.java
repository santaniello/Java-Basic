package br.com.designpatterns.state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está finalizado e não pode ser alterado !");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Orçamento já está finalizado e não pode ser alterado !");
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está finalizado!");
	}

}
