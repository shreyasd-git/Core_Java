package git.shreyas.methodoverloading;

public class Methodoverloading {
	
	//same method-name, different parameters/arguments. 
	//method return-type can be different
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int multiply(int a, int b, int c)
	{
		return a*b*c;
	}
	
	public float multiply(int a)
	{
		return a;
	}
	
	public static void main(String[] args) {
		
		Methodoverloading mthovrld = new Methodoverloading();
		System.out.println(mthovrld.multiply(12, 5));
		System.out.println(mthovrld.multiply(2, 8, 7));
		System.out.println(mthovrld.multiply(2));
		
	}

}
