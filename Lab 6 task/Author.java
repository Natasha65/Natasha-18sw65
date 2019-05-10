class Author
{
	private String name;
	private String email;
	private char gender;

	Author(String n , String e , char m)
	{
	name=n;
	email=e;
	gender=m;
	}

	public String getName()
	{
	  return name;
	}


	public char getGender()
	{
		return gender;
	}
	public void SetEmail(String e)
	{
       email=e;
	}

	public String  GetEmail()
	{
		return email;
	}

	public String ToString()
	{
		return  "Author [name = " +name+ " gender= "+gender+ "email = "+email+ " ] ";
	}



public static void main(String [] args)
{
	      Author a1=new Author("Natasha" , "swenatasha@gmail.com" , 'f');
	      String m =a1.getName();
	     char a= a1.getGender();
	      a1.SetEmail("swenatasha@gmail.com");
	      	String n =a1.GetEmail();
	      	String k=a1.ToString();
	      	System.out.println(k);
	  } 


}