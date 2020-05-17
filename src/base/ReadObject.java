package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		
		String separator = File.separator;
		String path = separator+"home"+	separator+"andrei"+separator+"eclipse-workspace"+separator+"Test";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person person1 = (Person) ois.readObject();
		
		
	}

}
