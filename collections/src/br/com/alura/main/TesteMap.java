package br.com.alura.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		Set<String> keySet = nomesParaIdade.keySet();
		Collection<Integer> values = nomesParaIdade.values();
		
		
		// obtendo um Set com as keys do Map
		for (String key : keySet) {
			System.out.println(key);
		}
		
		// obtendo uma Collection com os values do Map
		for (Integer value : values) {
			System.out.println(value);
		}
				
		// Obtendo a associação chave valor...
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
		for (Entry<String, Integer> associacao : associacoes) {
		    System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}
}
