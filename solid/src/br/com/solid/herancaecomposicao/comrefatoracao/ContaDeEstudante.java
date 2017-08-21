package br.com.solid.herancaecomposicao.comrefatoracao;

public class ContaDeEstudante {

	private ManipuladorDeSaldo m;
	private int milhas;

	public ContaDeEstudante(ManipuladorDeSaldo m, int milhas) {
		m = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		m.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

	public void setMilhas(int milhas) {
		this.milhas = milhas;
	}

}
