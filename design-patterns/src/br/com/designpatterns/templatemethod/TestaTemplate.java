package br.com.designpatterns.templatemethod;

public class TestaTemplate {
	public static void main(String[] args) {
		IKCV ikcv = new IKCV();
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		System.out.println(ikcv.calcula(orcamento));
	}
}
