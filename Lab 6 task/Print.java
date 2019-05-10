class Print
{
	public int n;
	public char c;

	Print()
	{
	n=0;
	c='x';
	}

	public void printing(int i , char c)
	{
        System.out.println("From first method");
        System.out.println("Integer value  is "+i);
        System.out.println("character value  is "+c);
	}


	public void printing(char c , int i )
	{
        System.out.println("From second method");
        System.out.println("character value  is "+c);
        System.out.println("Integer value  is "+i);
       
	}


	public static void main(String [] args)
	{
	  Print p1=new Print();
	  p1.printing(19 , 'n');
	  p1.printing('j' , 19);

	}
}