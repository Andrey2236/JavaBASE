package base;

public class Equals_stringpoll {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		System.out.println(x == y);
		
		// animal1 ->{1}// -> exfcnjr gfvznb 
		//animal2 ->{1}
		
		
		Animal_ss animal1 = new Animal_ss(1);
		Animal_ss animal2 = new Animal_ss(1);
		
		//System.out.println(animal1 = animal2);//мы сравниваем указатели тоесть участки памяти
		
		System.out.println(animal1.equals(animal2));
		
//		Object object = new Object();
//		Object.equals(object);
		
		String string1 = "hello";//  string1 -> {"hello"} string poll
		String string2 = "hello";// string2 -> {"hello")
		
		//equals - структурное сравнение объектов
	}
}

class Animal_ss{
	private int id;
	
	public Animal_ss(int id) {
		this.id  = id;
	}
	public boolean equals(Object obj) {
		Animal_ss otherAnimal = (Animal_ss) obj;
		return this.id == otherAnimal.id;
	}
	
}