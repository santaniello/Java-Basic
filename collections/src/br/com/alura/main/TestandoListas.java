package br.com.alura.main;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	  public static void main(String[] args) {

	        String curso1 = "Java I";
	        String curso2 = "Collections";
	        String curso3 = "WebServices";

	        ArrayList<String> cursos = new ArrayList<>();
	        
	        // adicionando elementos a lista
	        cursos.add(curso1);
	        cursos.add(curso2);
	        cursos.add(curso3);        

	        // removendo o segundo elemento da lista
	        cursos.remove(1);
	        
	    	System.out.println("O primeiro curso da lista eh o: " + cursos.get(0)); // como acessar o primeiro valor?
	        
	    	// percorrendo a lista com foreach
	        for (String curso : cursos) {
				System.out.println(curso);
			}
	        
	        // Ordenando a lista
	    	Collections.sort(cursos);
	    	
	    	System.out.println(cursos);
	        
	        
	  }
}
