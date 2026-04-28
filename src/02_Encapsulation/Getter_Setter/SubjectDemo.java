class Subject
{
	private String code;
	private String name;
	
	void setCode(String cd)
	{
		code = cd;
	}
	String getCode()
	{
		return code;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
}
class SubjectDemo
{
	public static void main(String[] args)
	{
		Subject oop = new Subject();
		oop.setCode("BCS-403");
		oop.setName("Object Oriented Programming");

		Subject os = new Subject();
		os.setCode("BCS-401");
		os.setName("Operating System");

		System.out.println(os.getName()+": " + os.getCode());
		System.out.println(oop.getName() +": "+ oop.getCode());
		
	}
}