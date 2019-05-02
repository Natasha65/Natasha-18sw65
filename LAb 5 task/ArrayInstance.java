import java.util.Scanner;

class UserArray
{
	 int arr[]=new int[5];
		
	public void populateArray()
	{          
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=input.nextInt();
			
		}
		

	}
	public void displayArray()
	{
		int even=0;
		int odd=0;

		for(int j=0 ; j<arr.length ; j++)
		{
			if(arr[j]%2==0)
			{
				 even++;
			}
			if(arr[j]%2!=0)
			{
				 odd++;
			}	
		}
		System.out.println("Even numbers are" +even);
        System.out.println("Odd numbers are" +odd);
		

}
}



class ArrayInstance
{
	public static void main(String[] args)
	{
          UserArray a1=new UserArray();
          a1.populateArray();
          a1.displayArray();
	}

}