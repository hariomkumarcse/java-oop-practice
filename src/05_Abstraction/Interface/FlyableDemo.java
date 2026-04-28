interface Flyable
{
	void fly();
}
abstract class Animal
{
	abstract void sound();

	void eat()
	{
		System.out.println("Animal is eating ..");
	}
}
class Dog extends Animal
{
	@Override
	void sound()
	{
		System.out.println("Dog barks");
	}
}
class Bird extends Animal implements Flyable
{
	@Override
	void sound()
	{
		System.out.println("Bird chirps");
	}
	@Override
	public void fly()
	{
		System.out.println("Bird is Flying");
	}
} 	
public class FlyableDemo
{
	public static void main(String[] args)
	{
		Animal d = new Dog();
		d.sound();
		d.eat();

		System.out.println();

		Bird b = new Bird();
		b.sound();
		b.eat();
		b.fly();
	}
} 