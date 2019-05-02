class Person
{
	String name;
	int age;
	String city;

Person()
{
	name="unknown";
	age=0;
	city="unknown";

}

	public void SetDetails(String s , int i , String r)
	{
       name=s;
       age=i;
       city=r;

	}

	public void ShowDetails()
	{
		System.out.println("Name is " +name);
		System.out.println("Age is " +age);
		System.out.println("Rollno is " +city);

	}
}

class Dog
{
	public static void main(String []args)
	{
		Person p1=new Person();
		p1.SetDetails("Natasha" , 19 ,"Pakistan");
		p1.ShowDetails();

	}
}