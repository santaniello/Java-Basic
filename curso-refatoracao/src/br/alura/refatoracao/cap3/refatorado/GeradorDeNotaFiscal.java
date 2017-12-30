package br.alura.refatoracao.cap3.refatorado;

public class GeradorDeNotaFiscal {
	public NotaFiscal gera(Fatura fatura) {
		NotaFiscal nf = new NotaFiscal(fatura.getValorMensal());
		new EnviadorDeEmail().enviaEmail(nf);
		new NFDao().salvaNoBanco(nf);
		return nf;
	}
}