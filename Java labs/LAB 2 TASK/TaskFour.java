class  TaskFour
{
	public static void main(String[] args)
	{

		int sum=0;
		double marks[]={12.34 , 56.8 , 56.78 , 34.78  , 67.8};
		for(int i=0 ; i<marks.length ; i++)
		{
			System.out.println(marks[i]);
			sum+=marks[i];

		}
		System.out.print("sum  is " +sum);

	}
}