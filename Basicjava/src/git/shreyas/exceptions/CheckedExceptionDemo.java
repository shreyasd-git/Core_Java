package git.shreyas.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, MyException
	{
		FileReader file = new FileReader("C:\\user\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
	
		//Read 3 lined from abc.txt file
		for (int i=0; i<=3 ; i++)
			System.out.println(fileInput.readLine());
		
		fileInput.close();
		throw new MyException(); //include MyException in throws
		
	}

}
