package br.com.solid.coesao.comrefatoracao;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVinteECincoPorCento());
		
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra)  {
	    this.regra = regra;
	}
	
	public RegraDeCalculo getRegra()  {
	    return regra;
	}
	
}
