package br.alura.refatoracao.cap3.refatorado;

import java.util.Calendar;

public class Matricula {

	private boolean trial;
	private Calendar expiracao;
	
	public Matricula(boolean ehTrial, Calendar expiracao) {
		this.trial = ehTrial;
		this.expiracao = expiracao;
	}
	
	public boolean isTrial() {
		return trial;
	}
	
	public Calendar getExpiracao() {
		return expiracao;
	}
	
	// substituindo um if por método... (facilita a leitura)...
	public boolean estaValida(){
		return !trial && expiracao.after(Calendar.getInstance());
	}
}
