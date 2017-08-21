package br.com.alura.java2.modelos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private List<Conta> contas;
    private Map<String, Conta> indexadoPorNome = new HashMap<>();

	
	public void adiciona(Conta conta){
		this.contas.add(conta);
		this.indexadoPorNome.put(conta.getNome(), conta);
	}
	
	public Conta pega(int x){
		return this.contas.get(x);
	}

	public int  pegaQuantidadeDeContas(){
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return this.indexadoPorNome.get(nome);
	}
	
}
