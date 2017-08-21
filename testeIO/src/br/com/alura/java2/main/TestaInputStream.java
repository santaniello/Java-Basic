package br.com.alura.java2.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * InputStream = recebe um array de bytes que vir de um arquivo de texto, console ou diversas outras fontes...
 * InputStreamReader = recebe um array de bytes (InputStream) e converte para um array de char...
 * BufferedReader = recebe um array de char e converte para uma string (linha do meu arquivo)...
 * 
 * */


public class TestaInputStream {
	public static void main(String[] args) throws IOException {
		//InputStream is = System.in; // Lê diretamente do console..
		InputStream is = new FileInputStream("entrada.txt"); 
		InputStreamReader isr = new InputStreamReader(is,"UTF-8"); // O segundo parâmetro é o encode para qual eu vou converter os bytes lidos (não é obrigatório)...
		BufferedReader br = new BufferedReader(isr); 
		
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null) {
			bw.append(linha);
			bw.newLine();
			System.out.println(linha);
			linha = br.readLine();			
		}	
		br.close();
		bw.close();
	}
}
