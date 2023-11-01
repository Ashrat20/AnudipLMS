package collectionpack;

import java.util.HashMap;

public class HashMapWithString 
{
	public static void main(String[] args) 
	{
		//Created a Hash Map 
		HashMap<String,String> hm = new HashMap<String,String>();
		//Adding the values in Hash Map
		hm.put("A", "Ramesh");
		hm.put("B", "Suresh");
		hm.put("V", "Ashrat");
		hm.put("W", "Roy");
		
		//Displaying the Values of Hash Map
		System.out.println("Contain of hash map with String is :"+hm);
	}

}
