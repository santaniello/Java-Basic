package br.com.alura.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {

	public static void main(String[] args) {
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");		
		
		// Toda collection tem o método iterator para podermos percorrer a mesma...
		Iterator<String> iterator = letras.iterator();
				
		// verificando se existe um próximo elemento na lista...
		while(iterator.hasNext()){			
			System.out.println(iterator.next());			
		}

	}

}
