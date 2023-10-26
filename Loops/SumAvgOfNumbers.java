//Calculating sum and Average of numbers in a array
package Arrayprogram;
import java.util.Scanner;
public class SumAvgOfNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Declare a array of size 5
		int arr[]=new int[5];
		//Taking input from the user
		for(int i=0;i<5;i++) 
		{
			System.out.print("Enter a number:");
			arr[i]=sc.nextInt();
		}
		//Displaying the array elements
		System.out.print("Numbers in array are:");
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
		
		int sum=0;
		double avg=0;
		//Calculating sum and Average of numbers
		for(int i=0;i<arr.length;i++) 
		{
		   sum+=arr[i];
		   avg=(double)sum/5;
		}
        System.out.print("\nSum of array :"+sum);	
		System.out.print("\nAverage of array :"+avg);
		sc.close();
	}
}
