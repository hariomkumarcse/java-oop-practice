import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseCSVData
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader( new FileReader("students.csv"));
		

			String line;
			boolean firstLine = true;

			while((line = reader.readLine()) != null)
			{
				if(firstLine)
				{
					firstLine = false;
					continue;
				}
	
				String[] data = line.split(",");

				System.out.println("ID : " + data[0]);
				System.out.println("Name : " + data[1]);
				System.out.println("Course : " + data[2]);
				System.out.println("Marks : " + data[3]);
				System.out.println("---------------------");
			}
			reader.close();

		}
		catch(IOException e)
		{
			System.out.println("Error while parsing CSV file.");
			System.out.println("Error : " + e.getMessage());
		}
	}
}