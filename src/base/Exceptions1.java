package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
	public static void main(String[] args) {
	try {
		readFile();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();//луше обрабатовать индивидуально
	}
//
//		try {
//			Scanner scanner = new Scanner(file);
//			System.out.println("next scaner");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("eroor 33");
//		}

	}

	public static void readFile() throws FileNotFoundException {
		File file = new File("sfdsdf");
		Scanner scanner = new Scanner(file);
	}
}
//обработка исключений делигируються по ирархии вверх