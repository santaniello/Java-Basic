package br.com.designpatterns.observer;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("imprimindo NF");
	}

}
