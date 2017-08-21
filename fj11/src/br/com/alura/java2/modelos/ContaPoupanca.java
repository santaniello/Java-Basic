package br.com.alura.java2.modelos;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

	@Override
	public int compareTo(ContaPoupanca conta) {
		if(this.numero < conta.numero){
			return -1;
		}
		if(this.numero > conta.numero){
			return 1;
		}
		return 0;
	}
}
