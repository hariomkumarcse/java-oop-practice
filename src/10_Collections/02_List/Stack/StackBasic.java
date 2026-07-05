import java.util.Stack;

public class StackBasic
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<>();

		stack.push("Java");
		stack.push("Spring");
		stack.push("SQL");

		System.out.println(stack);

		System.out.println("Top Element: " + stack.peek());
	}
}