import java.util.*;
class Shape
{
public abstract class Shape
{
	int x,y;
	public abstract void print_Area(double x, double y);
}
}
class Rectangle extends Shape 
{
	public void print_Area(double x, double y)
	{
		System.out.println("Area of RECTANGLE :" +(x*y));
	}
}
class Circle extends Shape 
{
	public void print_Area(double x, double y)
	{
		System.out.println("Area of circle :" +(3.14*x*x));
	}
}
class Triangle extends Shape
{
	public void print_Area(double x, double y)
	{
		System.out.println("Area of Triangle :" +(0.5*x*y));
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean st= true;
		while(st)
		{
			System.out.println("MENU:");
			System.out.println("1.AREA OF RECTANGLE");
			System.out.println("2.AREA OF CIRCLE");
			System.out.println("3.AREA OF TRIANGLE");
			System.out.println("4.EXIT");
			System.out.println("ENTER YOUR OPTION:");
			int opt =sc.nextInt();
			switch(opt)
			{
				case 1: System.out.println("Enter length:");	
		        	int x= sc.nextInt();
	 		        System.out.println("Enter Breadth:");
			        int y = sc.nextInt();
			        Rectangle r = new Rectangle();
			        r.print_Area(x,y);
      		  	        break;

				case 2: System.out.println("Enter Radius:");
		         	int a=sc.nextInt();
			        Circle c = new Circle();
			        c.print_Area(a,a);
			        break;

				case 3: System.out.println("Enter length:");
				int e=sc.nextInt();
		                System.out.println("Enter Breadth: ");
			        int d=sc.nextInt();	
			        Triangle t= new Triangle(); 
			        t.print_Area(e,d);
			        break;

           			case 4: System.out.println("Thank you");
			        st=false;
			        break;

				default: System.out.println("Invalid options");
			        break;
       		        }
                }
       }
}