package git.shreyas.classes;

public class Student {
	
	String name;
	int age;
	String address;
	
	//constructor
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//creating setters
	public void setName() 
	{
		this.name = name;	
	}
	
	public void setAge() 
	{
		this.age = age;	
	}
	
	public void setAddress() 
	{
		this.address = address;
	}
	
	//creating getters
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	
	//main Method
	public static void main(String[] args) {
		Student john = new Student("John", 12, "6-A, California");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		
	}

}
