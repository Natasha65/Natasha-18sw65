import java.util.Scanner ;

class MarkSheet
{
	public static void main(String [] args)
	{
		System.out.println("\n\n\t\t\tBoard of intermediate and secondary education sukkur ");
		System.out.println("\n\n\t\t\t Marksheet of hSC PART 1 ");
        Scanner input=new Scanner(System.in);
      
        System.out.print("Name" +"=");
        String name=input.nextLine();


        System.out.print("\nFather name" + "=");
        String fname=input.nextLine();


        System.out.print("\nIdentification" + "=");
        String iden=input.nextLine();


        System.out.print("\nSurname" + "=");
        String surname=input.nextLine();


        System.out.print("\nInstitute " + "=");
        String inst=input.nextLine();

       
        System.out.print("Enter marks of 3 subjects\n\n");
        
      
        System.out.print("1->Operating System =");
        int tnum1=input.nextInt();


        System.out.print("\n\n2-> Digital Computer and logic design =");
        int tnum2=input.nextInt();

        System.out.print("\n\n2-> Data base  =");
        int tnum3=input.nextInt();


        int sum=tnum1+tnum2+tnum3;
        double per=(sum*100)/300;
        System.out.print("Percentage is " +per);


        if(per>=90 )
        {
          System.out.print("\n\n  Congratulations -> you secure A+ GARDE ");
        }
       else   if(per>=80 &&  per<90)
        {
          System.out.print("\n\n  Congratulations -> you secure A GARDE ");
        }

       else  if (per >=70 && per <80) {
         System.out.print("\n\n B GRADE ");	
       }

       else 
       {
       	System.out.print(" fail");
       }
	}

}