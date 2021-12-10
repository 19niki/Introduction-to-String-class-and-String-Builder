/*
 * Non static methods of Strings
 * 
 */
public class Strpro12 {

	public static void main(String[] args) {
		String str1 =" Niki from bangalore";
		String str2 = "bangalore";
		String str3[] = str1.split("\\s"); // To split into string of array
		System.out.println(str1.toUpperCase()); // To convert the String to Uppercase
		System.out.println("----------------------------------------------");
		System.out.println(str1.toLowerCase()); // To convert the String to Lowercase
		System.out.println("----------------------------------------------");
		System.out.println(str1.contains(str2)); // Check the charcter sequence present in another string if not present it returns -1
		System.out.println("----------------------------------------------");
		System.out.println(str1.indexOf('k')); // Returns the index of the character
		System.out.println("----------------------------------------------");
        System.out.println(str1.indexOf(str2)); // Check the String sequence present in another string if not present it returns -1
        System.out.println("----------------------------------------------");
        System.out.println(str1.substring(10)); // It generates the new string from start index from position upto last character of the string
        System.out.println("----------------------------------------------");
        System.out.println(str1.substring(1, 4)); // It generates the new string from start index to end index excluding the last index
        System.out.println("----------------------------------------------");
        System.out.println(str1.endsWith("re"));  // It returns true if the string ends with the given string else false
        System.out.println("----------------------------------------------");
        System.out.println(str1.startsWith("ik")); // It returns true if the string Starts with the given string else false
        System.out.println("----------------------------------------------");
        System.out.println(str1.trim()); // It removes the all spaces present in front and back of the string
        System.out.println("----------------------------------------------");
        System.out.println(str1.equals(str2)); // It is used to compare two strings
        System.out.println("----------------------------------------------");
        System.out.println(str1.equalsIgnoreCase(str2)); //It is used to compare two string by ignoring the case
        System.out.println("----------------------------------------------");
        System.out.println(str1.strip()); // It removes the all spaces present in front and back of the string
        System.out.println("----------------------------------------------");
        System.out.println("To Split the string int string array");
        for(String words:str3)
        {
        	System.out.println(words);
        }
        
	}

}
