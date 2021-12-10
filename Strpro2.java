/*
 *2. To create the object of string class using new operator
 * 
 * - We can create the string object with the help of new follwed by the constructor of string class.
 * - The string object created using the new operator will be stored in the "Heap area" not in the "String pool area".
 * 
 * String str = new String("Hello"); //@ objects are created one for new and another is for String hello
 * 2 objects are created one in the String pool and another in the heap area.
 * 
 */
public class Strpro2 {

	public static void main(String[] args)
	{
       String str1 = "hello";
       String str2 = new String("hello");
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str1 == str2); //false
       System.out.println(str1.equals(str2)); //true
       System.out.println(str1.hashCode()); 
       System.out.println(str2.hashCode());
       System.out.println(str1.hashCode() == str2.hashCode()); //true both hashcode will be same since it is overriden
     

	}

}

/*str1.equals(str2) : Here the state of the object is created so it is true
 *str1 == str 2 : here we compare the address of the two objects not the refrences of 2 varibles  so the outcome is false.
 *
 *Because str1 is stored in the string pool area and str2 is stored in the heap area. so the ref will bw diffrent.
 *
 */
 