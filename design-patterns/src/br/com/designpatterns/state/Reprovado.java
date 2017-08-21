package br.com.designpatterns.state;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");		
	}
	
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado e não pode ser aprovado !");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Orçamento já está reprovado!");
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
