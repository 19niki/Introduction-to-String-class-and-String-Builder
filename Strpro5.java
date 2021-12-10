/*
 * To convert the char array to String
 * We can convert the charcter array to string in the following way
 * 1. String(char[] ch)
 * 2.String.valueof(char [] ch)
 * 3.Without using the built - in methods
 */

//EX Using String(char []ch)
public class Strpro5 {

	public static void main(String[] args) 
	{
       
		char ch[] = {'N','I','K','I'};
		String str1 = new String(ch);
		System.out.println(str1);
		


	}

}
