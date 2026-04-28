abstract class Animal
{
	abstract void sound();

	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
} 
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dogs barks");
	}
}
public class AnimalDemo
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.sound();
		d.sleep();
	}
}