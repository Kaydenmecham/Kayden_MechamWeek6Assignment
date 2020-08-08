//Kayden Mecham Csis 1400 Summer 2020

import java.util.Scanner;
import java.util.Random; 

public class Kayden_Mecham_Week6Assignment 
{

	public static void main(String[] args) 
	{

		forLoop();
		whileLoop();
		doWhile();
	}

	private static void forLoop() 
		{
		printdash();
		 System.out.println("Part 1: for loop: Average of randomly\ngenerated integers");
		printdash();
			Scanner in = new Scanner(System.in);
			Random test = new Random ();
			int range = 100000;
			int myArray[]  = new int[range];
			int max;
			int min;
			int sum = 0;
			System.out.print("Enter the bottom number of the range: ");
			min = in.nextInt();
			System.out.print("Enter the top number of the range: ");
			max = in.nextInt();
			System.out.print("Enter how many numbers to generate: ");
			range = in.nextInt();
			System.out.print("Generated random numbers: ");
		for(int i = 0; i < range; i++)
			{
				myArray[i] = test.nextInt((max-min)+1) + min;
				sum += myArray[i];
				System.out.printf("\n" + myArray[i]);
			}
		
		 System.out.println("\nAverage of generated numbers: " + sum / range);
		printdash();
		}		
		

	
	private static void whileLoop() 
	{
	int enter;
	int sum = 0;
	int count = 1;
	 Scanner wloop = new Scanner(System.in);
	  System.out.println("Part 2: while loop: Average of user-entered\nintegers using while loop");
	printdash();
	  System.out.print("Enter integers to average. Enter -1 to\nfinish\n\nEntry 1:"); 
	  enter = wloop.nextInt();
		 while (enter !=-1)
		  {
			  sum = sum + enter;
			  count++;
			  System.out.print("Entry " + count +": ");
			  enter = wloop.nextInt();
		  }
		  System.out.println("Number of entries: " + (count - 1));
		  System.out.println("Average of user-entered numbers: " + (sum/count));
	printdash();	  
	}

	
	private static void doWhile() 
	{
	int numb;
	boolean exit = false;
	Scanner dwloop = new Scanner(System.in);
	 System.out.println("Part 3: do-while loop: Display menu until\nuser chooses to exit");
	printdash();	  

	 do 
	 	{
		menu();
		 numb = dwloop.nextInt();
		  switch (numb)
		  {
		  case 1:
			  menu();
				 numb = dwloop.nextInt();
		  case 2:
			  menu();
				 numb = dwloop.nextInt();	 
		  case 3: 
			  menu();
				 numb = dwloop.nextInt();
		  case 4:
			  exit = true;
			  break;
		  default:
			  System.out.println("Invalid Choice");
		  }
	 	} while (!exit);
	 	System.out.println("Goodbye!");
	 	dwloop.close();
	}

	private static void menu() 
	{
	printequa();
	 System.out.println("MENU");
	printequa();
	 System.out.println("1: Choice 1\n2: Choice 2\n3: Choice 3\n4: Exit");
	printequa();
	 System.out.println("Enter 1, 2, 3, or 4 to Exit: ");
	printequa();
	}

	private static void printdash()
	{
	System.out.println("--------------------------------------");
	System.out.println("-------------------------------");
	}

	private static void printequa() 
	{
		System.out.println("==============================");
	}

	

}
