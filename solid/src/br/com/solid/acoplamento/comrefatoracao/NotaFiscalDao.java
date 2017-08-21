package br.com.solid.acoplamento.comrefatoracao;

public class NotaFiscalDao implements AcaoAposGerarNota  {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Gravando NF no banco");		
	}
}
