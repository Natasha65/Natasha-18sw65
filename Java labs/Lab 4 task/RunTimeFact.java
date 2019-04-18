class RunTimeFact
{
	public static void main(String [] args)
	{
		int fact=1;
		String num=args[0];
		int a=Integer.parseInt(num);
		while(a >0)
		{
			fact=fact*a;
			a--;

		}
		System.out.print("factorial of a number is =" +fact);
	}
}