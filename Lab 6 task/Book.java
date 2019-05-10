class Book
{
	private String name;
	private Author authors[];
	private double price;
	private int quantity;

	public Book(String name , Author[] authors,double price)
	{
       this.name=name;
       this.authors=authors;
       this.price=price;
	}

	public Book(String name , Author[] authors,double price ,  int quantity)
	{
       this.name=name;
       this.authors=authors;
       this.price=price;
       this.quantity=quantity;
	}

	public String getName()
	{
	return name;
	}
	public Author[] getauthor()
	{
	 return authors;
    }
	public void setPrice(double b )
	{
		price=b;
	}
	public double getPrice()
	{
		 return price;
	}

	public void setQuan(int t )
	{
		quantity=t;
	}
    
	public int GetQuan( )
	{
	   return quantity;
	}

	public String ToString()
	{	String authorlist="";
		for(int i=0;i<authors.length;i++)
		{
			authorlist+=authors[i].ToString()+",";
			}	
		

	 return  "Book [name =" +name+ "Authors = "+authorlist+"price =" +price+ " quantity =" +quantity+ "]" ;
	}


	public static void main(String []args)
	{
		Author a1=new Author("Laffore ","swe",'f');
		Author a2=new Author("robbert","moiz",'m');
		Author[] authors={a1,a2};	
       Book b1=new Book("Java" , authors,  189.90 , 23);
        String a=b1.getName();
        b1.setPrice(198.09);
        double b=b1.getPrice();
        b1.setQuan(10);
        int c=b1.GetQuan();
        Author[] k=b1.getauthor();

        String d=b1.ToString ();
        System.out.println(d);




	}
}