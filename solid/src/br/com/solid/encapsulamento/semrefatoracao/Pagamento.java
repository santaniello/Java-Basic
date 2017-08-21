package br.com.solid.encapsulamento.semrefatoracao;

public class Pagamento {	
	private double valor;
	private MeioDePagamento meioDePagamento;
	public Pagamento(double valor, MeioDePagamento meioDePagamento) {
		this.valor = valor;
		this.meioDePagamento = meioDePagamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public MeioDePagamento getMeioDePagamento() {
		return meioDePagamento;
	}
	public void setMeioDePagamento(MeioDePagamento meioDePagamento) {
		this.meioDePagamento = meioDePagamento;
	}	
	
	
}
