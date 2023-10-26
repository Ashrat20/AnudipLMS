//Inheritance 
package ineritancepack;
//Created a parent class person 
class person
{
	//declare a field for person class
	private String name;
	private int age;
	//created a constructor of person class
	public person(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	//declare a method speak 
	void speak()
	{
		System.out.println("Name of Student :"+name+"\nAge is :"+age);
	}
}
//Created a child class Student1 which inheriting person class
class Student1 extends person
{
	//declare a field for Student1 class
	private String grade;
	//created a constructor of Student1 class
	public Student1(String name, int age, String grade) 
	{
		super(name, age);
		this.grade = grade;
	}
	//declare a method study
	void study()
	{
		System.out.println("Grade is :"+grade);
	}
}
public class InheritanceStudent 
{

	public static void main(String[] args) 
	{
		//Created a object of Student1 class
		Student1 sobj =  new Student1("Ashrat",22,"A");
		//calling the both the method of classes from student1 object
		sobj.speak();
		sobj.study();
	}
}