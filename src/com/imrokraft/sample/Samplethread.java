package com.imrokraft.sample;

public class Samplethread {

	public static void main(String[] args) {
		
		TargetClass target=new TargetClass();
		
		
			Mythread1 t1=new Mythread1(1,target);
			Mythread1 t2=new Mythread1(2, target);
			Mythread1 t3=new Mythread1(3, target);
		t1.start();
		t2.start();
		t3.start();
	
		
			
		
	
	}

}
