package threadpack;

class OddThread extends Thread
{
	public void run()
	{
		System.out.println("Odd Numbers from (1 to 100) are :");
		for (int i =1;i<=100;i++) 
		{
			if(!(i%2 == 0))
				System.out.println(i+" ");
		}
	}
}

//Created a class EvenThread which count the Even numbers from 1 to 100
class EvenThread extends Thread
{
	public void run()
	{
		System.out.println("Even Numbers from (1 to 100) are :");
		for (int i =1;i<=100;i++) 
		{	
			if(i%2 == 0)	 
				System.out.println(i+" ");	 
	    }
	}		
}

//Created a class OddThread which count the odd numbers from 1 to 100

public class EvenOddThreadDemo 
{
	public static void main(String[] args) 
	{		
		OddThread ot=new OddThread();
		ot.start();
		try 
		{
			// Wait for the OddThread to finish before starting EvenThread
			ot.join(); 
	    }
		catch (InterruptedException e) 
		{
			e.printStackTrace();
	    }
		EvenThread et=new EvenThread();
		et.start();
	}
}