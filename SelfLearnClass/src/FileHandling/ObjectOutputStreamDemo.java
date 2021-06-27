package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class newclass{
	public newclass(String string) {
		// TODO Auto-generated constructor stub
	}

	
}

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("objIO"));
			//String str = "this is string to be written";
			Employee emp = new Employee(123, "abc", "i");
			
			stream.writeObject(emp);
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
