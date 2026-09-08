import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer = new FileWriter("students.csv");

			writer.write("id,name,course,marks\n");
			writer.write("101,Hariom,Java,85\n");
			writer.write("102,Rahul,Spring Boot,90\n");
			writer.write("103,Aman,SQL,78\n");
			writer.write("104,Rohit,Python,88\n");

			writer.close();

			System.out.println("CSV file written successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while writing CSV file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}