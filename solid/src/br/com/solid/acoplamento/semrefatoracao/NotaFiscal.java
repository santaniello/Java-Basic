package br.com.solid.acoplamento.semrefatoracao;

public class NotaFiscal {

	@SuppressWarnings("unused")
	private double valor;
	@SuppressWarnings("unused")
	private double imposto;
	
	public NotaFiscal(double valor, double imposto){
		this.valor = valor;
		this.imposto = imposto;
	}
}
