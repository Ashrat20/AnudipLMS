package stringpack;

public class StringOperationDemo 
{

	public static void main(String[] args) 
	{
		//Declare a string s1 
		String s1 = "Welcome to Java World";
		
		//Finding the Character at 5th position in String
		char s2 = s1.charAt(4);
		System.out.println("character at 5th position is :" +s2);
		
		//Declare other String s3 
		String s3 = "Welcome";
		//checking the s3 string to from s1 
		boolean result = s1.equalsIgnoreCase(s3);
		if(result==true)
		   System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		//Declare other String s4
		String s4 = "- Let us learn";
		//Concating the String s4 into s1 
		String result1 = s1.concat(s4); 
		System.out.println("After concatenation New String is :\n" +result1);
		
		//Checking the first occurrence of character "a"
		String s5 = "a";
		int index =s1.indexOf(s5);
		System.out.println("The first occurrence of character a is:" +index);
		
		//Replacing the "a" with "e" in String s6
		String s6 = result1.replace('a', 'e');
		System.out.println("String after replacing a with e :\n"+s6);
		
		//converting the String s7 into substring 
		String s7 = s6.substring(3, 10);
		System.out.println("Substring is :"+s7);
		
		//converting the String to lower case
		String s8 = s6.toLowerCase();
		System.out.println("coverting the string into Lower case :\n"+s8);
	}
}