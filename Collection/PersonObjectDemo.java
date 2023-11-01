package collectionpack;

import java.util.ArrayList;
import java.util.List;

//Declare a Person class
class Person
{
	private String name;
	public Person(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "name=" + name;
	}	
}

public class PersonObjectDemo 
{
	public static void main(String[] args) 
	{ 
		List<Person> als= new ArrayList<>();
		//Adding the 10 values in Array List 
		als.add(new Person("Ashish"));
		als.add(new Person("Ashrat"));
		als.add(new Person("Prerna"));
		als.add(new Person("Hemanshu"));
		als.add(new Person("Nisha"));
		als.add(new Person("Aman"));
		als.add(new Person("Sonali"));
		als.add(new Person("Shahid"));
		als.add(new Person("Saif"));
		als.add(new Person("Aftab"));
		
		//Iterating the Array list values and displaying with for each loop 
		System.out.println("Contain in Array list are :");
		for (Person obj:als)
			System.out.println(obj+" ");
	}
}