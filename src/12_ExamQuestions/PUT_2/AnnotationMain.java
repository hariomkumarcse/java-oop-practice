import java.lang.annotation.*;

//Step 1 : Create custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Developer
{
	String name();
}

//Step2 : Apply annotation to a class
@Developer(name = "Hariom Kumar")
class MyClass
{
	void display()
	{
		System.out.println("This is a sample class.");
	}
}

//Step3 : Access annotation
public class AnnotationMain
{
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.display();

		Developer dev = obj.getClass().getAnnotation(Developer.class);
		System.out.println("Developer Name: " + dev.name());
	}
}