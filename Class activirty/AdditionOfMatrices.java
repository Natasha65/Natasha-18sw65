import java.util.Scanner;

class AdditionOfMatrices
{
	public static void main(String [] args)
	{


	   int A[][]=new int[3][3];
	   int B[][]=new int[3][3];
	   int C[][]=new int[3][3];

    Scanner input=new Scanner(System.in);
    System.out.println("Enter Elements of A");
	  for(int i=0 ; i<3 ; i++)
	  {
	  for(int j=0 ; j<3   ; j++)
	  {
	  	System.out.print("A ["+i+"]["+j+"] =");
            A[i][j]=input.nextInt();

           }
           }

 System.out.println("Enter elements of B");
	  for(int i=0 ; i<3  ; i++)
	  {
	  for(int j=0 ; j<3   ; j++)
	  {
	  		System.out.print("B ["+i+"]["+j+"] =");
	  	B[i][j]=input.nextInt();
               

           }
           }
            System.out.println(" A matrix ");
              for(int i=0 ; i<3 ; i++)
	  {
	  for(int j=0 ; j<3 ; j++)
	  {
             System.out.print(" "+A[i][j]);

           }
             System.out.println();
           }



         

 System.out.println(" B matrix ");

	  for(int i=0 ; i<3  ; i++)
	  {
	  for(int j=0 ; j<3  ; j++)
	  {
             System.out.print(" "+B[i][j]);

           }
           System.out.println();
           }


      


           
	  for(int i=0 ; i<3  ; i++)
	  {
	  for(int j=0 ; j<3   ; j++)
	  {
             C[i][j]=A[i][j]+B[i][j];
         

           }
             
           }

                     System.out.print("Addition of A+B :");
	  for(int i=0 ; i<3  ; i++)
	  {
	  for(int j=0 ; j<3   ; j++)
	  {
             System.out.print(" " +C[i][j]);
         

           }
            System.out.println();
           }
 

 }
}