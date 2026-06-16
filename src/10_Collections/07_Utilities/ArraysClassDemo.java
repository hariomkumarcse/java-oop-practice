import java.util.Arrays;

public class ArraysClassDemo
{
	public static void main(String[] args)
	{
		int[] numbers = {20,21,35,56,34,20};
		
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers);
	
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(numbers));

		int index = Arrays.binarySearch(numbers,30);
		System.out.println("Index of 30: " + index);

		Arrays.fill(numbers,100);

		System.out.println("After fill: ");
		System.out.println(Arrays.toString(numbers));

		int[] copyArray = Arrays.copyOf(numbers, numbers.length);

		System.out.println("Copied Array: ");
		System.out.println(Arrays.toString(copyArray));

		boolean isEqual = Arrays.equals(numbers, copyArray);

		System.out.println("Arrays Equal: " +isEqual);
	}
}