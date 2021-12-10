/*
 *  charestics of the String class
 *  -  The object of the String class is immutable, The object once created cannot be modifed.
 *  -  When we try to modify the String object a new object created and the refrence is returned.
 *  
 */
public class Strpro3 {

	public static void main(String[] args) {
		String str1 ="Hello";
		System.out.println(str1.concat("world")); //Helloworld
		System.out.println(str1); // Hello because the conacted string is not stored
		String str2 = str1.concat("world");
        System.out.println(str2); //Helloworld
	}

}
