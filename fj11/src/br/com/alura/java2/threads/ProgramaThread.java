package br.com.alura.java2.threads;

public class ProgramaThread implements Runnable{

	private int id;           

    public void setId(int id) { 
        this.id = id; 
    } 

    public int getId(){ 
        return this.id;
    }
	
	@Override
	public void run() {
		 for (int i = 0; i < 10000; i++) {
             System.out.println("Programa " + id + " valor: " + i);
         }		
	}

}
