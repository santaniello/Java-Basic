package br.com.felipe.java8.main;

public class TesteThreadComLambda {

	public static void main(String[] args) {
//		new Thread(new Runnable() {
//		    @Override
//		    public void run() {
//		        System.out.println("Executando um Runnable");
//		    }
//
//		}).start();

		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
