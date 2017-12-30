package br.alura.refatoracao.cap3.refatorado;

public class NotaFiscal {

	private int id;
	private double valorBruto;
	private double impostos;

	public NotaFiscal(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public double getValorLiquido() {
		return this.valorBruto - this.impostos;
	}
	
	// Encapsulando a regra na classe nota fiscal...
	public double getImpostos() {
        double imposto = 0;
        if(valorBruto < 200) {
            imposto = valorBruto * 0.03;
        }
        else if(valorBruto > 200 && valorBruto <= 1000) {
            imposto = valorBruto * 0.06;
        }
        else {
            imposto = valorBruto * 0.07;
        }
        return imposto;
    }

}