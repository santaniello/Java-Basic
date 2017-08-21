package br.com.solid.acoplamento.comrefatoracao;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	@Override
	public void executa(NotaFiscal nf){
		System.out.println("Enviando NF por email....");
	}
}
