package git.shreyas.staticdemo;

public class Student {
		
		//Encapsulation - not allowing to access properties of class, instead use getter setter
		String name;
		int age;
		String address;
		static String college = "XYZ";
		static int count = 0; 
		
		
		public  Student(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		//static method can have only static variable
		static void count() {
			count = count + 1;
		}
		
		//non-static variable can have static variable
		int getCount() {
			return count;
		}
		
		//Static Block
		
		static {
			System.out.println("Static Block Demo");
		}

}
