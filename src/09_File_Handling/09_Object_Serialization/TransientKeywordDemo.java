import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeywordDemo
{
	static class User implements Serializable
	{
		private static final long serialVersionUID = 1L;

		String username;

		transient String password;

		User(String username, String password)
		{
			this.username = username;
			this.password = password;
		}
	}

	public static void main(String[] args)
	{
		try
		{
			User user = 
				new User(
					"Hariom",
					"secret123"
					);

			ObjectOutputStream output = 
				new ObjectOutputStream(
					new FileOutputStream("user.ser")
					);

			output.writeObject(user);
			output.close();

			ObjectInputStream input = 
				new ObjectInputStream(
					new FileInputStream("user.ser")
					);

			User savedUser = 
				(User) input.readObject();

			input.close();

			System.out.println("Username: " + savedUser.username);
			System.out.println("Password: " + savedUser.password);
		}
		catch(IOException e)
		{
			System.out.println("I/O error.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}