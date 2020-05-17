package base;

public class Enum1 {
//	// используеться для перечисления типов
//	private static final int DOG = 0;
//	private static final int CAT = 1;
//	private static final int FROG = 2;

	public static void main(String[] args) {
//		int animal = DOG;//->10 undefine
//
//		switch (animal) {
//		case DOG:
//			System.out.println("dog");
//			break;
//		case CAT:
//			System.out.println("Cat");
//			break;
//		default:
//			System.out.println("frog");
//
//		}
		Animal_Enume animal = Animal_Enume.CAT;
		System.out.println(animal.getTranslation());
			switch (animal) {
		case DOG:
			System.out.println("dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		default:
			System.out.println("frog");

		}
	}

}
