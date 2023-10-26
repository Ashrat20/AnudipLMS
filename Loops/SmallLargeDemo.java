//Finding the Largest and Smallest Numbers in a array
package Arrayprogram;
import java.util.Scanner;

public class SmallLargeDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Declare a array of size 10
		int arr[]=new int[10];
		//Taking input from the user
		for(int i=0;i<10;i++) 
		{
			System.out.print("Enter a number:");
			arr[i]=sc.nextInt();
		}
	
		//Displaying the array elements
		System.out.print("Numbers in array are:");
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
		
	    //Calculating Largest and Smallest Numbers
			int largest = arr[0],smallest=arr[0];
			for (int i = 0; i<arr.length; i++) 
			{
				if(arr[i]>largest) 
					largest = arr[i];
			    else if(arr[i]<smallest) 
					smallest = arr[i];
			}
		System.out.print("\nSmallest number in array :"+smallest);	
		System.out.print("\nLargest number in array :"+largest);
		sc.close();
	}
}