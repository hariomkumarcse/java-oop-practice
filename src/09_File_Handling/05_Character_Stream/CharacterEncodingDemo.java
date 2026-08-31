import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CharacterEncodingDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(
					new FileOutputStream("unicode.txt"),
					StandardCharsets.UTF_8
				)
			);

			writer.write("Hello Java");
			writer.newLine();
			writer.write("Namaste Hariom");
			writer.newLine();
			writer.write("Java Character Encoding");
			writer.newLine();
			writer.write("English + हिन्दी + 日本語");

			writer.close();

			System.out.println("UTF-8 text written successfully.");

			BufferedReader reader = new BufferedReader(
				new InputStreamReader(
					new FileInputStream("unicode.txt"),
					StandardCharsets.UTF_8
				)
			);

			String line;

			System.out.println("\nReading UTF-8 file:");

			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}

			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while handling character encoding.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}