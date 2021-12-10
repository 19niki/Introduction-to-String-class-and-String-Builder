/*
 * To convert the String into a charcter array in the follwing ways
 * 1. tochararray()
 *    - It is a non - static method of string class which is used to convert the string to char arrray
 */
public class Strpro8 {

	public static void main(String[] args) {
		String str = "Niki";
		char ch[] = str.toCharArray();
		for (int i=0; i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
