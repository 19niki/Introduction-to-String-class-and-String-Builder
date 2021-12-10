import java.util.Scanner;

public class Strpro14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<3;i++)
		{
			System.out.println("Enter the fruit name");
			String str1 = sc.nextLine();
			System.out.println(str1.substring(str1.length()-3));
		}
		 

	}

}
