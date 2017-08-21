package br.com.alura.java2.main;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);

	    if (x1.equals(x2)) {
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }
	    
	    // testaando o método toString da classe Integer
	    System.out.println(x1.toString());
	    
	    // parseando um objeto válido
	    System.out.println(Integer.parseInt("10"));
	 // parseando um objeto inválido
	    System.out.println(Integer.parseInt("rre"));
	    
	}
}
