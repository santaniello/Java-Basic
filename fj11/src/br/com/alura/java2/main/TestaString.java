package br.com.alura.java2.main;

import java.io.PrintStream;

public class TestaString {
	public static void main(String[] args) {
		
		// Substituindo caracteres de uma string 		
        String s = "fj11";
        s = s.replaceAll("1", "2");
        System.out.println("Substituindo 1 por 2: " + s);
        
        // Verificando se uma string contém outra... 		
        boolean retorno =  s.contains("22");
        System.out.println("A string contém 22 ? " + retorno);
        
        // removendo espaçoes em branco do ínicio e do fim da string
        System.out.println(s.trim());
        
        System.out.println("A string está vazia ? " + s.isEmpty());
        
        // saber a quantidade de caracteres de uma string
        System.out.println("Quantidade de caractres da string = " + s.length());
        
        
       
        
        
    }
}
