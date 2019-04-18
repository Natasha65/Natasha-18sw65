import java.util.Scanner ;

class Wovel
{
	public static void main(String [] args)
	{
		Scanner  input=new Scanner(System.in);
		System.out.println("Enter  any character ");
		char a=input.next().charAt(0);

		switch(a)
		{
			case 'a':
 			System.out.println("it is vowel");
 			 break;
 	
     	
 		case 'e':
 			System.out.println("it is vowel");
 			break;
 		
 		case 'i':
 			System.out.println("it is vowel");
 			break;
 		
 		case 'o':
 		    System.out.println("it is consonent");
 			
 			break;
 		
 		case 'u':
 		    System.out.println("it is vowel");
 			break;
 		
 		 default:
 		 {
 		 	System.out.println("it is consonent ");
 		 }			
	 }
		}
	}
