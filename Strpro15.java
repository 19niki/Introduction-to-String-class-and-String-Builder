// To reverse the string method1
public class Strpro15 
{
   public static void main(String[] args) 
   {
	  String str1 = "Hello";
	  char ch[] = str1.toCharArray();
	  for(int i=0;i<ch.length/2;i++)
	  {
		  char temp = ch[ch.length-i-1]; 
		  ch[ch.length-i-1] = ch[i];
		  ch[i] = temp;
		  
	  }
	  String str2= new String(ch);
	  System.out.println(str2);
   }
}
