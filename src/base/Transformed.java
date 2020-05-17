package base;

public class Transformed {
	public static void main(String[] args) {
		//upcasting - восходящее преобразование всегда безопасно
		Animal animal = new Dog();
		//downcasting - нисходящее преобразование 
		Dog dog2 =(Dog) animal;
		dog2.bark();
		
		Animal a = new Animal();
		Dog dog = (Dog)a;
		dog.bark();
		
	}

}
