package base;

import java.io.File;
import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {
		//checked exception(compile time exception) исклюительные случаи не компилируються
		//Unchecked(run time exception)
		
//		File file = new File("test");
//		Scanner scanner = new Scanner(file);
		
		try {
			int[] arr = new int[2];
		}catch(RuntimeException e){
			
		}//no zachem
		
	}
}
