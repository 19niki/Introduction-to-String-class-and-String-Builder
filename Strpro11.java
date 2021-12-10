/*
 * Ex: to convert the string into array
 */
public class Strpro11 {

	public static void main(String[] args) {
		String str = "Nikhil ravi";
		char ch[] = new char[str.length()];
		for(int i=0; i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			System.out.println(ch[i]);
		}
        
	}

}
