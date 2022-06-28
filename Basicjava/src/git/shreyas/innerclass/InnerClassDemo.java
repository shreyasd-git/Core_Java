package git.shreyas.innerclass;

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.display();
		
		
		OuterClass outerClass = new OuterClass();
		outerClass.outerClassMethod();
		
	}

}
