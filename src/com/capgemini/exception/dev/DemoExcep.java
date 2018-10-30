package com.capgemini.exception.dev;
public class DemoExcep {

	public static void main(String[]args) {

		int[]ar = {1,2,3,4,5,6};
		int i = 10;
		int j = 0;
		int k;
		try 
		{
			System.out.println(ar[8]);
		    k = i/j;
		    System.out.println("Operation performed");
		    System.out.println(k);
		}
		catch(Exception e)
		{
			
			System.out.println(" Exception Occur");
		}
		
		System.out.println("Execution Completed");				
	}
}