package br.com.solid.encapsulamento.comrefatoracao;

import java.util.Collections;
import java.util.List;

public class Fatura {
	
	private List<Pagamento> pagamentos;
	private double valor;
	private boolean pago;

	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(pagamentos);
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

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if(valorTotalDosPagamentos()> this.valor){
			this.pago = true;
		}		
	}

	private double valorTotalDosPagamentos() {
		double total = 0;
		for(Pagamento p :pagamentos){
			total += p.getValor();
		}		
		return total;
	}

	
	
	
	

}
