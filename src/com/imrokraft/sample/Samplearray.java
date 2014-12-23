package com.imrokraft.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Samplearray {

	public static void main(String[] args) {

		int [] array={1,120,555,666,785,965,789,325,652,85};

		try {
			System.out.println("Enter your choice");
			System.out.println("1: sort array\n2:reverse order\n3:odd index \n4:even number");
			int key=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());



			switch (key) {
			case 1:
				System.out.println("Sorted array");
				for (int i = 0; i < array.length; i++)
				{
					for (int j = 0; j < array.length; j++) 
					{
						if(array[i]<array[j])
						{
							int c=array[i];
							array[i]=array[j];
							array[j]=c;
						}
					}
				}
				for (int i = 0; i < array.length; i++)
				{
					System.out.println(array[i]);
				}
				break;
			case 2:
				System.out.println("reverse order");

				for(int i=array.length-1;i>=0;i--)
				{
					System.out.println(array[i]);
				}
				break;

			case 3:
				System.out.println("Odd index");
				for (int i = 0; i < array.length; i++)
				{
					if (i%2!=0)
					{
						System.out.println(array[i]);	
					}
				}
				break;
			case 4:
				System.out.println("Even numbers");
				for (int i = 0; i < array.length; i++)
				{
					if (array[i]%2==0)
					{
						System.out.println(array[i]);	
					}
				}
				break;


			default:
				break;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
