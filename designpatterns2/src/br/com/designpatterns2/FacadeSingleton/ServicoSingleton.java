package br.com.designpatterns2.FacadeSingleton;

public class ServicoSingleton {
	private static Servico instancia;

	public Servico getInstancia() {
		if (instancia == null) {
			instancia = new Servico();
		}
		return instancia;
	}
}
