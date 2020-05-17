package base;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value;
		do{
			System.out.print("inpyt 5 ");
			 value = scanner.nextInt();// нельзя декларировать переменную в фигурных сскобок
		}while(value!=5); 
		System.out.print("outpyt 5");
	}	

}
