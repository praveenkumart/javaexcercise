package com.imrokraft.sample;

public class Mythread1 extends Thread {
	
	 int ThreadId;
	TargetClass target;
	public Mythread1(int ThreadId,TargetClass target) {
	this.ThreadId=ThreadId;
	this.target=target;
	}
	
		public void run() {
			
           synchronized (target) {
        	   try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	target.call(ThreadId);
           
			
			
		}

		
		
	
}
