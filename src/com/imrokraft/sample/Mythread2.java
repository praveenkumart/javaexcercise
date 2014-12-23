package com.imrokraft.sample;

public class Mythread2 extends Thread {

	public void run() {
		
		
		try {
			System.out.println("First Message from thread two");
			
				sleep(3000);
				System.out.println("second Message from thread two");
				
				sleep(3000);
				System.out.println("Third Message from thread two");
				
				sleep(3000);
				
			 }catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
