class Seven
{
	public static void main(String [] args)
	{


	String s="Natasha, 18 , BE software";
	String s2="Umair , 50 ,  BE Software";
	String [] spliting=s.split(", " , 3);
	String [] splitting=s2.split(", " , 3);

	System.out.println("Student 1");
	System.out.println("Name " +spliting[0]);
	System.out.println("rollno " +spliting[1]);
    System.out.println("Department " +spliting[2]);



    System.out.println("Student 2");
	System.out.println("Name " +spliting[0]);
	System.out.println("rollno " +spliting[1]);
    System.out.println("Department " +spliting[2]);




}



}