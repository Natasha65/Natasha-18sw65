 import java.util.Scanner;

class TakeInput 
{
	public static void main(String [] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Please enter an String value and Integer value ");
		String name=x.next();
		int rollno=x.nextInt();
		System.out.println(name +" " +rollno);

	}
}