import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println("IOException: " + e.getMessage());
        }

        System.out.println("Resource Closed Automatically.");
    }
}