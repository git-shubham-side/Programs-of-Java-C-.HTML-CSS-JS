import java.util.Scanner;

class Numb{

public static void main(String [] args)
{
	int a,firstdig,firstnum,secondig,lastdig;
	
	Scanner Input = new Scanner(System.in);
	
System.out.println("Enter a three Number:");

	a = Input.nextInt();
	
	firstdig=a/10;
	
	firstnum=firstdig/10;
	
	System.out.println("First num is:"+firstnum);
	
	
	secondig=firstdig%10;
	System.out.println("Second digit is:"+secondig);
	
	 lastdig = a%10;
	 System.out.println("Third Digit value is:"+lastdig);
	
	
	


}
}