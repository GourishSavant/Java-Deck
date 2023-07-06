
public class Main
{
	public static void main(String[] args) {
	    int n=98765,rev=0,num;
	    
	    while(n!=0)
	    {
	       num= n%10;
	       rev=rev *10 +num ;
	       n=n/10;
	    }
		System.out.println("reverse of the number is "+ rev );
	}
}
