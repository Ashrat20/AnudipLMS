package stringpack;

public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
		//Created a object of string buffer class
		StringBuffer sb = new StringBuffer("This is StringBuffer");
		//Appending the String Buffer 
		sb.append("  This is a sample program");
		System.out.println(sb);

		//Inserting the String 
		sb.insert(20, " Object");
		System.out.println(sb);
		
		//Reversing the String
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		
		//Replacing the Buffer with Builder 
		sb.replace(14, 20, "Builder");
		System.out.println(sb);
	}

}
