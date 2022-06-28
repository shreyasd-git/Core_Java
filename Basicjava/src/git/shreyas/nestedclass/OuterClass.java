package git.shreyas.nestedclass;

public class OuterClass {
	
	static int outerstaticMember = 15;
	int outerMember = 10;
	private static int outerprivateMember = 20;
	
	static class StaticNestedClass{
		void display() {
			System.out.println("Static Member of Outer Class: " + outerstaticMember);
			
			System.out.println("Static Private Member of Outer Class: " + outerprivateMember);
			
			//cannot access non-static variable in static Class
			//System.out.println("non static member of outerclass: " +outerMember);
		}
	}

}
