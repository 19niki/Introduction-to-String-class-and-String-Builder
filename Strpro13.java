import java.util.Scanner;

public class Strpro13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the country name");
		String ct = sc.nextLine();
		System.out.println("Enter the state name");
		String st =sc.nextLine();
		if(ct.startsWith(st))
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("bye");
		}

	}

}
