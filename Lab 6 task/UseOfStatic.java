class UseOfStatic
{

    static int i;
    static{ i=0;}
    public static void  SetI(int n )
    {
    i=n;
    } 

    public static void GetI()
    {
    System.out.println("Static value is "+i);

    }
	public static void main(String [] args)
	{
         UseOfStatic.SetI(19);

         UseOfStatic.GetI();
	}
}