package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		String separator = File.separator;
		String path = separator+"home"+	separator+"andrei"+separator+"eclipse-workspace"+separator+"Test";
		File file = new File(path);
		
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] numbers = line.split(" ");	
//		System.out.println(Arrays.toString(numbers));
//		int[] number = 	new  int[3];
//		int counter = 0;
//		for(String number : numbersString) {
//			numbers[counter++] = Integer.parseInt(number);
//		}
//		while(scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
		scanner.close();
		
	}

}
