/*
 * Methods of StringBuilder class
 */
public class Strpro19 {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("hello");
		StringBuilder str2 = new StringBuilder("I am banaglore");
		str1 = str1.append('A'); //append method is overloaded so it can take int,char,double and string
		str1 = str1.append(79);
		System.out.println(str1);
		System.out.println(str1.charAt(5));
		System.out.println(str2.length());
		System.out.println(str2.indexOf("am"));
		System.out.println(str2.substring(2, 7));
		System.out.println(str2.reverse());
		System.out.println(str1.replace(2, 2, "f"));
		

	}

}
