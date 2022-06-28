package git.shreyas.staticdemo;

public class StaticDemo {
	
	public static void main(String[] args) {
		Student student = new Student("Ajay", 18, "Golkonda");
		System.out.println("Name is: " + student.name);
		System.out.println("Age is: " + student.age);
		System.out.println("Address is: " + student.address);
		
		//access static variable college by Class Student and  not by object student)
		System.out.println("Colllege name is: " + Student.college);
		
		
	}

}
