package base;

public class polimorf extends Animal{
	// полиморфизм способность метода обрабатовать данные разного типа
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		//animal.bark();
		Dog dog = new Dog();
		dog.eat();
		test(dog);
	
		
	}
	public static void test (Animal animal) {
		// полиморфизм вызов на различных типов 
		animal.eat();
		
	}

}
