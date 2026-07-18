public class ExceptionHierarchy 
{
	public static void main(String[] args) 
	{

        	System.out.println("Throwable");
        	System.out.println(" ├── Error");
        	System.out.println(" └── Exception");
        	System.out.println("      ├── IOException");
        	System.out.println("      ├── SQLException");
        	System.out.println("      └── RuntimeException");
    }
}