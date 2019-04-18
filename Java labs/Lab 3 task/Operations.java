import java.util.Scanner;

class Operations
{
	public static void main(String [] args)
	{
		 
		String num1=args[0];
		int a=Integer.parseInt(num1);
		String num2=args[1];
		int b=Integer.parseInt(num2);
		 Scanner x=new Scanner(System.in);
          
       System.out.println("Enter operation * - / +");
       char ch=x.next().charAt(0);

     if(ch=='+')
     {
     	   int sum=a+b;
     	   System.out.println("Addition =" +sum);
     }

     if(ch=='-')
     {
     	   int sub=a-b;
     	   System.out.println("Subtraction =" +sub);
     	   
     }

     if(ch=='*')
     {
     	   	int mul=a*b;
     	   	System.out.println("Multiplication =" +mul);
     	   
     }

     if(ch=='/')
     {
     	 	double div=a/b;
     	 	System.out.println("division=" +div );
     	    
     	   
     }

		

	
		
	
		
		
		
		



	}
}