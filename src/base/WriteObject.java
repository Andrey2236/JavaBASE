package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
		public static void main(String[] args) {
			
			Person person1 = new Person (3,"SDS");
			Person person2 = new Person (1,"ASDA");
			
			String separator = File.separator;
			String path = separator+"home"+	separator+"andrei"+separator+"eclipse-workspace"+separator+"Test";
			
			try {
				FileOutputStream  fos = new  FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(person1);
				oos.writeObject(person2);
				
				oos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
