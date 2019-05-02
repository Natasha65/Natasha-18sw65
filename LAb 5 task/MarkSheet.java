class MarkSheet
{
	int  sub1;
     int  sub2;
	int  sub3;

     MarkSheet()
     {
          sub1=0;
          sub2=0;
          sub3=0;
     }
	void Setmarks(int m1, int m2 , int m3)
	{
          sub1=m1;
          sub2=m2;
          sub3=m3;
	}
     
     void TotalMarks()
     {
     	int marks=sub1+sub2+sub3;
          System.out.println("Total Marks = " +marks);

         double  per=(marks*100)/300;
          System.out.println("Percentage is =" +per);
}
	public static void main(String [] args)
	{
		MarkSheet m1=new MarkSheet();
          m1.Setmarks(30 , 40 , 50);
		m1.TotalMarks();


		

	}
}