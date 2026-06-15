import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo
{
	public static void main(String[] args) throws IOException
	{
		Properties props = new Properties();

		props.load(new FileReader("user.properties"));
		props.list(System.out);

		props.setProperty("username", "Admin");
		props.setProperty("password", "admin123");

		props.list(System.out);
		props.store(new FileWriter("user.properties"), "User Details");
	}
}