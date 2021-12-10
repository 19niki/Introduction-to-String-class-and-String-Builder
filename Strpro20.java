/*
 * WAP to count the lower case and digits and special charcters in the string
 */
public class Strpro20 {

	public static void main(String[] args) {
		String str = "AGAGA14168#@%!&ybaka";
		int lowcount=0, numcount=0,specount=0,upcount=0;
		char ch[] =str.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	    	if(ch[i]>='A' && ch[i]<='Z')
	    	{
	    		upcount++;
	    	}
	    	else if(ch[i]>='a' && ch[i]<='z')
	    	{
	    		lowcount++;
	    	}
	    	else if(ch[i]>='0'  && ch[i]<='9')
	    	{
	    		numcount++;
	    	}
	    	else
	    		specount++;
	    }
		System.out.println(upcount);
		System.out.println(lowcount);
		System.out.println(numcount);
		System.out.println(specount);

	}

}
