package com.imrokraft.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=1;
		try {
			int number=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
			for (int i = number; i >0 ; i--) 
			{
				factorial=factorial*i;
			}
			
			System.out.println("factorial of "+factorial);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
