//Summation of Two numbers
package mypackage;

import java.util.Scanner;

public class SumOfTwoNumbers 
{

	public static void main(String[] args) 
	{
		//Taking Two number from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int n1 = sc.nextInt();
		System.out.print("Enter the Second number :");
		int n2 = sc.nextInt();
		//Adding two number 
		int n3 = n1 + n2;
		//displaying the summation of two number
		System.out.println("Sum of two numbers is :" +n3);
		sc.close();
	}

}
