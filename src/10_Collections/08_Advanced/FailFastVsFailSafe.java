import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe
{
	public static void main(String[] args)
	{
		System.out.println("----Fail Fast----");

		try
		{
			ArrayList<String> list = new ArrayList<>();

			list.add("Java");
			list.add("SQL");
			list.add("Spring");

			Iterator<String> iterator = list.iterator();

			while(iterator.hasNext())
			{
				String value = iterator.next();

				if(value.equals("SQL"))
				{
					list.add("Hibernate");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("\n---- Fail Safe ----");

		CopyOnWriteArrayList<String> safeList = new CopyOnWriteArrayList<>();

		safeList.add("Java");
		safeList.add("SQL");
		safeList.add("Spring");

		for(String value : safeList)
		{
			if(value.equals("SQL"))
			{
				safeList.add("Hibernate");
			}
		}
		System.out.println(safeList);
	}
}