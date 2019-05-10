class Student
{
	String name;
	int age;
	int rollno;

	Student()
	{
	name="unknwon";
	age=0;
	rollno=0;
	}

	public void SetInfo(String n , int i )
	{
	name=n;
	age=i;
	}

	public void SetInfo(String n   , int i , int r)
	{
	name=n;
	age=i;
	rollno=r;
	}

	public void display()
	{
	System.out.println("Name is " +name);
	System.out.println("Age is " +age);
	System.out.println("Rollno is " +rollno);

	}



	public static void main(String [] args)
	{
	 Student[] studentarray=new Student[3];
      studentarray[0]=new Student();
	  studentarray[0].SetInfo("Natasha " , 19 , 65);
	  studentarray[1]=new Student();
	  studentarray[1].SetInfo("Moiz" , 20 , 125);
	 for(int i=0 ; i<studentarray.length ; i++)
	 {
	   
	   studentarray[i].display();
	 }



		
	}
}