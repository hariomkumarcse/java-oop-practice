class Shape
{
	void displayArea()
	{
		System.out.println("Area not defined");
	}
}
class Rectangle extends Shape
{
	int length = 10;
	int breadth = 5;

	@Override
	void displayArea()
	{
		int area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}
}
public class ShapeMain
{
	public static void main(String[] args)
	{
		Shape obj;
		
		obj = new Shape();
		obj.displayArea();

		obj = new Rectangle();
		obj.displayArea();
	}
}