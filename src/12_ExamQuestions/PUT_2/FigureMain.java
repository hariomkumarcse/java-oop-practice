// Abstract Class
abstract class Figure
{
	//Abstract method
	abstract void draw();

	//Concrete method
	void message()
	{
		System.out.println("This is a figure");
	}
}
//Subclass
class Circle extends Figure
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
//SubClass
class Triangle extends Figure
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
}
public class FigureMain
{
	public static void main(String[] args)
	{
		Figure f1 = new Circle();
		f1.draw();
		f1.message();

		Figure f2 = new Triangle();
		f2.draw();
		f2.message();
	}
}