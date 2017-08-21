package br.com.alura.java2.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		
        // Comparando o use de ArrayList e LinkedList...
		
		System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
                        
        List<Integer> teste = new LinkedList<>();

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto para inserir na primeira posição usando LinkedList: " + tempo);
                        
        System.out.println("Iniciando...");
        long inicio2 = System.currentTimeMillis();

                        
        List<Integer> teste2 = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            teste2.add(0, i);
        }

        long fim2 = System.currentTimeMillis();
        double tempo2 = (fim2 - inicio2) / 1000.0;
        System.out.println("Tempo gasto para inserir na primeira posição usando ArrayList: " + tempo2);
        
        // Comparando o fato de percorrer uma lista usando foreach e não usando foreach (for comum)
        
        System.out.println("Iniciando...");
                        
        List<Integer> teste3 = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            teste3.add(i);
        }
        
        long inicio3 = System.currentTimeMillis();
        
        for (int i = 0; i < teste3.size(); i++) {
			teste3.get(i).intValue();
		}        

        long fim3 = System.currentTimeMillis();
        double tempo3 = (fim3 - inicio3) / 1000.0;
        
        System.out.println("Tempo gasto para percorrer uma List sem enhanced for: " + tempo3);
        
        long inicio4 = System.currentTimeMillis();
               
        for (Integer integer : teste3) {
			integer.intValue();
		}

        long fim4 = System.currentTimeMillis();
        
        double tempo4 = (fim4 - inicio4) / 1000.0;

        System.out.println("Tempo gasto para percorrer uma List com enhanced for: " + tempo4);
        	
	}

}
