package git.shreyas.trycatch;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {
	public void writeList() {
		try {
			List<Integer> list = new ArrayList<>(10);
			list.add(55);  //added to index 0
			
			System.out.println("Entering" + " try Block");
			
			//trying to access index 1
			Integer a = list.get(1); 
			
			System.out.println("accessing the first element: " + a);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("caught IndexOutOfBoundsException Exception " +e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("This is Finally Block");
		}
		
	}

}
