package base;

public class Arrays_of_Strings {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		String[] strings = new String[3];
		strings[0] = "Hello";
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		for (String string : strings) {
			System.out.println(string);
		}
		
		int value = 0;
		String s = "fsf";
		System.out.println(s);
	}
}
