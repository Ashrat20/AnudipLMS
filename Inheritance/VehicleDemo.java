// Using single Inheritance
package ineritancepack;
//Created a Parent class Vehicle
class Vehicle
{
	//declare a field for vehicle class
	private String brand;
	private String model;
	private int year;
	//Created a constructor of class vehicle
	public Vehicle(String brand, String model, int year) 
	{
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	//declare a method drive 
	void drive()
	{
		System.out.println("Brand is :"+brand+"\nModel is :"+model+"\nYear is :"+year);
	}
}
//Created a Child class car which is inheriting the vehicle class 
class Car extends Vehicle
{
	//declare a field of car class
	private String color;
	////Created a constructor of class car
	public Car(String brand, String model, int year, String color) 
	{
		super(brand, model, year);
		this.color = color;
	}
	//declare a method honk
	void honk()
	{
		System.out.println("Color is :"+color);
	}
}
public class VehicleDemo 
{

	public static void main(String[] args) 
	{
		//Created a object of car class
		Car c = new Car("BMW","Sclass",2009,"Blue");
		//calling the both the method of classes from car object
		c.drive();
		c.honk();
	}
}