/*
 * String Builder and String Buffer
 * - Since String class in immutable we go for the StringBuilder and StringBuffer
 * - Both of this belong to java.lang.pacakge and used to store strings
 * -The object of both classes are mutable in nature
 * Constructors of String builder class
 * 1. StringBuilder() - To create the empty string object
 * 2. StrinhBuilder(String) - It can create the string object
 * 
 * StringBuilder str = "hello"; //cte we are unable to create the string builder like this
 * 
*/

public class Strpro17
{
	
	public static void main(String [] args) 
	{
	    //StringBuilder str = "hello"; //CTE cannot convert the string to string builder
		StringBuilder str = new StringBuilder(); //To create the empty string
		StringBuilder str2 = new StringBuilder("Niki"); //To create the String
		System.out.println(str);
		System.out.println(str2);
		
		
	}
}
