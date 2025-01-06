import java.util.Scanner();//Importing input File
class Prime
{
public static void main(String [] args) 
{
   //Printing prime & Non-Prime Number
   //Declaration of variables

   int i,p,n; //The (i) variable is for Loop condition & the (P) variable, declaration will be discuss further

            System.out.print("Enter a Number:";
            Scanner Input = new Scanner(System.in);//Taking input From user & storing in the (n) variable.
                  n = input.nextInt();
         

            p=1;// Declaring the p=1;

        for(i=2;i<n;i++)//starting the loop from 2 and ending on 6 in this loop the loop will find the factorial of 7 if the factorial gets found then the loop will declare it's prime number
        {
                if(n%2==0)//Giving the if condition if the number id divided by 2 and the reminder is zero delacre the number to non prime number
                {
                    p=0;
                }
        } 

        if(p==1)//p==1 is fro Prime number
        {
            System.out.println("Prime Number");
        }else
        {
            System.out.println("Non-Prime Number");
        }
    

}
}


