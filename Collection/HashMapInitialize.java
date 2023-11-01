package collectionpack;

import java.util.HashMap;

public class HashMapInitialize 
{

	public static void main(String[] args) 
	{
		//Created A Hash Map 
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		//Adding Values in Hash Map
		hm.put("A", 10);
		hm.put("B", 50);
		hm.put("V", 60);
		hm.put("W", 80);
		
		//Displaying the values of Hash map
		System.out.println("Contain of hash map is :"+hm);
	}

}
