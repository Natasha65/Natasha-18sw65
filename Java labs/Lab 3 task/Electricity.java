import java.util.Scanner;

class Electricity
{
	public static void main(String [] args)
	{
	

		Scanner input =new Scanner(System.in);
		
        System.out.print("1.Enter number of units =");
        int unit1=input.nextInt();
        	int     sum=0; 
        if(unit1>300 )
        {
            sum+=(unit1-300)*30;
            unit1=300;
        }
        if(unit1<=300 && unit1>200)
        {
     	sum+=(unit1-200)*25;
     	unit1=200;
        }
         if(unit1<=200 && unit1>100)
        {
        	sum+=(unit1-100)*20;
        	unit1=100;

        }
         if(unit1>50 && unit1<=100)
        {
        	sum+=(unit1-50)*15;
        	unit1=50;
        }
         if(unit1<=50 && unit1>0)
        {
             sum+=unit1*10;

        }
        System.out.println("price per unit in rupees " +sum);

	}
}