package br.com.alura.java2.modelos;

import br.com.alura.java2.exception.ValorInvalidoException;

public abstract class Conta {
	protected int numero; 
	
	private String nome;
	
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		if(valor <= 0) {
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
		
	public abstract void atualiza(double taxa);
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	
	
}
