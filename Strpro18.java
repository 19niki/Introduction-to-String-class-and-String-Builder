/*
 * Diffrence B/W string class and string buffer
 * String s1 = "hello";
 * String s2 =s1;
 * s2=s1.append("ram");
 * Sytem.out.print(s1) //hello
 * System.out.print(s2) //hello ram
 * 
 */
public class Strpro18 {

	public static void main(String[] args) {
		 String s1 = "hello";
		  String s2 =s1;
		  s2=s1.concat("ram");
		  System.out.println(s1); //hello
		  System.out.println(s2) ;//hello ram
		  System.out.println(s1 == s2);
		 
		StringBuilder str1= new StringBuilder("Hello");
		StringBuilder str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		str2.append("ram");
		System.out.println(str1); //helloram
		System.out.println(str2); //helloram
		System.out.println(str1 == str2);

	}

}
