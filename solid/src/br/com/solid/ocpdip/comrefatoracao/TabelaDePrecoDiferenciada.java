package br.com.solid.ocpdip.comrefatoracao;

public class TabelaDePrecoDiferenciada implements TabelaDePreco{
	public double descontoPara(double valor) {
		if (valor > 1000)
			return 0.03;
		if (valor > 1000)
			return 0.05;
		return 0;
	}
}
