package git.shreyas.innerclass;

public class OuterClass {
	
	class InnerClass{
		void display()
		{
			System.out.println("This is inner class");
		}
	}
	
	void outerClassMethod() {
		System.out.println("This is Outer Class Method");
		
		class MethodLocalClass{
			void localInnerMethod() {
				System.out.println("This is local Inner Method");
			}
		}
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
	}

}
