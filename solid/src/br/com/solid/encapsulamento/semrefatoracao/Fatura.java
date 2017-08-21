package br.com.solid.encapsulamento.semrefatoracao;

import java.util.List;

public class Fatura {
	
	private List<Pagamento> pagamentos;
	private double valor;
	private boolean pago;

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	
	
	

}
