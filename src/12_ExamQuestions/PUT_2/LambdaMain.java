@FunctionalInterface
interface IOperations
{
	int doOperation(int a);
}	

public class LambdaMain
{
	public static void main(String[] args)
	{
		IOperations obj = a->a*a*a;

		int result1 = obj.doOperation(Integer.parseInt(args[0]));
		int result2 = obj.doOperation(10);

		System.out.println("Result1 = " + result1);
		System.out.println("Result2 = " + result2);

	}
}