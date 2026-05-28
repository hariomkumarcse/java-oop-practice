import java.util.Stack;
public class StackDemo
{
	public static void main(String[] args)
	{
		Stack<String> strings = new Stack<>();
		
		strings.push("First");
		strings.push("Second");
		strings.push("Third");
		strings.push("Fourth");
		
		System.out.println("Stack: " + strings);
		System.out.println("Item popped: " + strings.pop());
		System.out.println("Stack: " + strings);

		System.out.println("Item peeked: " + strings.peek());
		System.out.println("Stack: " + strings);
		
		System.out.println("Stack Empty?: " + strings.empty());
		
		System.out.println("Second found at position: " + strings.search("Second"));
		
		strings.clear();
		
		System.out.println("Stack: " + strings);
		System.out.println("Stack Empty?: " + strings.empty());

		//System.out.println("Item popped: " + strings.pop());

		System.out.println("Stack: " + strings);
		

	}
}