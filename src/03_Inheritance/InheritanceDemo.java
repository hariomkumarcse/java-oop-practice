class Shape
{
	void draw()
	{
		System.out.println("Drawing a shape");
	}

}
class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing a circle");
	}
}
public class InheritanceDemo
{
	public static void main(String[] args)
	{
		Shape shape = new Shape();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		
		Shape shapeRef;
		
		shapeRef = shape;
		shapeRef.draw();
		shapeRef = rectangle;
		shapeRef.draw();
		shapeRef = circle;
		shapeRef.draw();

	}
}

