/*
 * The difference between the String literal and New operator
 */
public class Strpro4 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		System.out.println("Using string literals");
		System.out.println(str1 == str2); //true
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.hashCode()); //same
		System.out.println(str2.hashCode()); //same
		
		System.out.println("=====================================================");
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("Using new operator");
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true
		System.out.println(str3.hashCode()); //same
		System.out.println(str4.hashCode()); //same
		
		
		

	}

}
