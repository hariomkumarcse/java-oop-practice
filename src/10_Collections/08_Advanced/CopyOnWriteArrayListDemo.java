import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo
{
	public static void main(String[] args)
	{
		CopyOnWriteArrayList<String> technologies = new CopyOnWriteArrayList<>();

		technologies.add("Java");
		technologies.add("SQL");
		technologies.add("Spring");

		for(String teach : technologies)
		{
			System.out.println(teach);

			if(teach.equals("SQL"))
			{
				technologies.add("Hibernate");
			}
		}
		
		System.out.println("\nUpdate List: ");
		System.out.println(technologies);
	}
}