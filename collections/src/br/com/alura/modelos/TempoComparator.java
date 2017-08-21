package br.com.alura.modelos;

import java.util.Comparator;

public class TempoComparator implements Comparator<Aula> {
	@Override
	public int compare(Aula aula1, Aula aula2) {
		if(aula1.getTempo() > aula2.getTempo()){
			return 1;
		}
		if(aula1.getTempo() < aula2.getTempo()){
			return -1;
		}
		return 0;		
	}
}
