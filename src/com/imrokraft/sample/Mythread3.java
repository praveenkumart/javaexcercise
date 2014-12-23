package com.imrokraft.sample;

public class Mythread3 extends Thread {

	public void run() {
		
		
		try {
			System.out.println("First Message from thread three");
			
			sleep(3000);
			System.out.println("second Message from thread three");
			
			sleep(3000);
			System.out.println("Third Message from thread three");
		//	System.out.println("");
			sleep(3000);
			 }catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
