package br.com.felipe.java8.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteListas {	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		
	
		// Ordenando Listas ...		
		
		/*
		 Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		 		  		
  		 // Usando o modo antigo com comparator 
	     Collections.sort(palavras, comparador);
				
		
		// Usando Java 8 (default method sort da classe List (Apenas no Java 8))		
		 palavras.sort(comparador);
		 
		 
		 // Usando classe anonima
		 palavras.sort(new Comparator<String>() {
    	 		public int compare(String s1, String s2) {
        			if(s1.length() < s2.length()) 
            			return -1;
        			if(s1.length() > s2.length()) 
            			return 1;
        			return 0;
    			}
		});
		
		 		
		// Primeira forma de se fazer com lambda 		
		 		
		palavras.sort((s1,s2) -> {
			if(s1.length() < s2.length()) 
				return -1;
			if(s1.length() > s2.length()) 
				return 1;
			return 0;			
		});
		
		// Segunda forma de se fazer com lamda
		   palavras.sort((s1, s2) -> s1.length() - s2.length());		
		*/
		
		// Terceira forma de se fazer com lambda
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));		
		
		System.out.println(palavras);
		
		// =====================================================================================================		
				
		/*
		
		// Modo padrão de se iterar sob uma lista...		
		
		for (String p : palavras) {
			System.out.println(p);
		}
						
		// Iterando sob uma lista com consumer... (Java 8)
		
		Consumer<String> consumidor = new ConsumidorDeString();					
        // palavras.forEach(consumidor);
		
		// Usando classe anônima
		
		palavras.forEach(new Consumer<String>(){
		    public void accept(String palavra) {
		        System.out.println(palavra);
		    }
		});
		
		*/
		
		//Usando Lambda...
		
		/**
		 * Regras para usar o Lambda ...
		 * 
		 * O lambda trabalha apenas com interfaces funcionais, ou seja, aquelas que possuem apenas
		 * um método abstrato...
		 *
		 * **/
		
		palavras.forEach(palavra -> System.out.println(palavra));
		
		//	Outra forma de escrever a mesma expressão lambda ...	
		palavras.forEach((String palavra) -> System.out.println(palavra));
		
		// Usando Method Reference
		// A expressão abaixo é a mesma que a de cima ...
		palavras.sort(Comparator.comparing(String::length));
		
		
		// Outro exemplo de method reference com foreach 
		palavras.forEach(System.out::println);
		
		
	}
}


/**
 * Classe responsável por ordenar a nossa lista de Strings
 * Implementa a interface comparator...
 * 
 * */
class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
}


/**
 * A interface Consumer foi implementada no Java8 fazendo com que a
 * iteração sob listas fique muito mais fácil. No caso abaixo, ao pegar 
 * cada elemento da lista, nós damos um sysout no mesmo...
 * */
class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}
