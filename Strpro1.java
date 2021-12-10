/*
 * String - In java strings are stored as Objects with the help of the object of follwing class
 *          1. Java.lang.String.
 *          2. Java.lang.StringBuilder
 *          3. Java.lang.StringBuffer
 *         
 * String Class - String class is defined in the java.lang.object class it is used to store strings
 *              - String class is public
 *              - String class is final we cannot override it
 *              - String class extend the Java.lang.object
 *             
 * Constructor Of String class -
 *              - No argument constructor ()
 *                It is used to create the empty string
 *              - String (String str)
 *                It is used to create the string objects and intlize the string objects
 *              - String (char [] ch)
 *                It is used to create the String objects and intlize with the charcters present in the charcter string
 * 
 * In string class all the object class methods such as toString(), Equlas(Object o) and hashcode() method are overriden               
 * 
 * To create the object of string class
 * 1. String literal - Anything which is enclosed in the double quotes is a string literal every time string literal is created a object of
 *                     String class  is created in the string pool area and it's address is returned
 * 2. new operator                                      
 */
// Ex: How to create the string using string literal
public class Strpro1 {

	public static void main(String[] args) 
	{
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
	}

}

/* Tracing
 * Here the object for the string hello is created and the ref is given back i.e ref of string class is override by the string class is so it is "hello"
 * And again when we create the same string now the string is checked at the run - time if it alerdy exist then the address is returned and new object is 
 * not created.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
