class Area
{
	private int length;
	private int  width ;
	private double   side1;
	private double  side2;



	Area()
	{
	length=0;
	width=0;
	side1=0.0;
	side2=0.0;
	}

	public int  SetArea(int l , int w)
	{
             return l*w;    
	}

	public double  SetArea(double  s ,double s2)
	{
             return s*s2;    
	}

  public static void main(String [] args)
  {
        Area a1=new Area();
        int a=a1.SetArea(8  ,9);
        System.out.println("Area of rectangle is "+a);
        double d=a1.SetArea(8.9 , 9.9);
        System.out.println("Area of Square is " +d);

}



  }


