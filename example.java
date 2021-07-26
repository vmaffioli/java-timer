package threadtest;

import java.util.Timer;

public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println("Iniciando");
		
		Timer t = new java.util.Timer();
		t.schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {

		            	System.out.println("Executando timer");
		            	
		                t.cancel();
		            }
		        }, 
		        5000 
		);	
		
		System.out.println("Finalizando");
	}

}
