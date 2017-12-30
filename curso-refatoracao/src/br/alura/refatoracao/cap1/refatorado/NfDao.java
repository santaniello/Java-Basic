package br.alura.refatoracao.cap1.refatorado;

public class NfDao {	
	public void salvaNoBanco(NotaFiscal nf) {
		String sql = "insert into notafiscal (cliente, valor)" + "values (?," + nf.getValorLiquido() + ")";
		System.out.println("Salvando no banco" + sql);
	}
}
