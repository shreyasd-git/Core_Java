package git.shreyas.exceptions;

public class SimpleUncheckedExceptionsDemo {
	public static void main(String[] args) {
		
		//no error at CompileTime like a FileNotFound Exception (CompileTime/Checked)
		int data = 100/0; //divide by 0 - runtime exception
		System.out.println(data);
		
		String a= null; //null values
		System.out.println(a.charAt(0));
		
	}

}
