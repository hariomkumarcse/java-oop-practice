import java.util.TreeSet;

class TreeSetSortedSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<Integer> integer = new TreeSet<>();
		
		integer.add(3);
		integer.add(4);
		integer.add(1);
		integer.add(2);
		
		System.out.println(integer);
		System.out.println("Integer First (lowest) element: " + integer.first());
		System.out.println("Integer Last (highest) element: " + integer.last());
		System.out.println("Integer HeadSet (3) (<3): " + integer.headSet(3));				System.out.println("Integer TailSet (2) (>=2): " + integer.tailSet(2));
		System.out.println("SubSet (2,3) (>=2 && <3): " + integer.subSet(2,3));



		
	}
}