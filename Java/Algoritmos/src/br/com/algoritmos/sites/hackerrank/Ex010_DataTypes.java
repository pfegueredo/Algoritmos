package br.com.algoritmos.sites.hackerrank;

import java.util.Scanner;

class Ex010_DataTypes{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{

			try
			{
				long x=sc.nextLong();
				System.out.println(x+" can be fitted in:");
				if(x>=-128 && x<=127)System.out.println("* byte");
				if(x>=-32768 && x<=32767)System.out.println("* short");
				if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
				Long num = (long) Math.pow(-2, 63);
				Long num2 = (long) Math.pow(2, 63)-1;
				System.out.println(num);
				if(x>=(num) && x<=(num2))System.out.println("* long");
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}

		}
	}
}



