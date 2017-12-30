package br.alura.refatoracao.cap2.refatorado;

import java.util.List;

public class Trem {
	private List<Vagao> vagoes;
    private int capacidade;

    public boolean podeReservar(int lugaresAReservar) {

        int lugaresLivres = capacidade - lugaresJaReservados();
        return lugaresLivres > lugaresAReservar; 
    }

    private int lugaresJaReservados() {
        int lugaresJaReservados = 0;
        for(Vagao vagao : vagoes) {
            lugaresJaReservados += vagao.reservados();
        }
        return lugaresJaReservados;
    }	
}