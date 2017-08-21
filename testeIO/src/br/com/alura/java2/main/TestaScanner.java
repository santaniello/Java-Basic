package br.com.alura.java2.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("entrada.txt");
        Scanner entrada = new Scanner(is);
        
       PrintStream ps = new PrintStream("saida.txt");
        
        while (entrada.hasNextLine()) {
            String linha = entrada.nextLine();
            ps.println(linha);            
        }
        entrada.close();
        ps.close();
	}

}
