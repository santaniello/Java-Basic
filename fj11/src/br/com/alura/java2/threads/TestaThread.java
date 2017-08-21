package br.com.alura.java2.threads;

public class TestaThread {

	public static void main(String[] args) {
		ProgramaThread p1 = new ProgramaThread();    
        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        ProgramaThread p2 = new ProgramaThread();    
        p2.setId(2);

        Thread t2 = new Thread(p2);
        t2.start();

	}

}
