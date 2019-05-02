class Combination
{
	Combination(Student s  , MarkSheet m )
	{

	}
	public void CreateStudentResult(Student s  , MarkSheet m )
	{
		s.setdata("natasha" , "software " , 65);
		s.Showdata();
		m.Setmarks(30 , 40 , 50);
		m.TotalMarks();


	}

	public static void main(String [] args)
	{
		Student s=new Student( );
		MarkSheet m =new MarkSheet( );

		Combination c=new Combination(s, m);
		c.CreateStudentResult(s, m);


	}

}