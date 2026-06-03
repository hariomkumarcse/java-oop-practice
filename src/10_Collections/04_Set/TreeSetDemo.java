import java.util.TreeSet;
class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> names = new TreeSet<>();

		names.add("Hariom");
		names.add("Ram");
		names.add("Aman");
		names.add("Nityanand");

		System.out.println("Names: " + names);
	}
}