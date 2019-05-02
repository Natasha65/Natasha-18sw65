class Student
{
	String name;
	String department;
	int rollno;

			Student()
			{
				name="unknown";
				department="unknown";
				rollno=0;
			}
   void setdata(String  n , String d , int r)
   {
      name=n;
      department=d;
      rollno=r;
   }

	public void Showdata()
	{
	System.out.println("name is " +name);
	System.out.println("department is " + department);
	System.out.println("rol no is " + rollno);
	}
  



	public static void main(String [] args)
	{
	  Student s1=new Student();
	   s1.setdata("Natasha" , "Software"  ,65);
	   s1.Showdata();
	  
	 
	}
}