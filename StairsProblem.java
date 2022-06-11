package stairspackage;

import java.util.Scanner;

public class StairsProblem {
	
	// Climbing Stairs Problem - May 23rd -2022
	
	
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		int stairs,steps=0;
		int f1,f2,f3;
		f1=1;
		f2=2;
		f3 = f1+f2;
		int a,b;
		a = f3;
		b = f2;
		System.out.println("Enter the n, steps to calculate the different ways to climb");
		stairs = Integer.parseInt(input.nextLine());
		if(stairs== f1 || stairs == f2|| stairs==f3)
		{
			System.out.println("Steps required:"+stairs);
		}
		for(int i=4;i<=stairs;i++)
		{
			steps = a+ b;	// f(n) = f(n-1) + f(n-2)
			b = a;			// f(n-2) -> move to f(n-1)
			a = steps;		// f(n-1) -> move to f(n)
		}
		System.out.println("Different ways to climb :"+steps);
		
	}

}
