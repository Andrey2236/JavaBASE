package base;

import java.util.ArrayList;
import java.util.List;

public class Generic {
	public static void main(String[] args) {
		List animals  = new ArrayList();
		Animal ourAnimal = new Animal();
		animals.add("cat");
		animals.add("DOG");
		
		String animal = (String) animals.get(1);
		System.out.println(animal);
		
		List<String> animals2 = new ArrayList<String>();
		animals2.add("cat");
		animals2.add("dog");
		
		String animal2 = animals2.get(0); 
		
		// 7 java
		List<String> animals3 = new ArrayList<>();
		
		
		
		
		
	}

}
