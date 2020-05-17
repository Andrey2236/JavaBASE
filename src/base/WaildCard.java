package base;

import java.util.ArrayList;
import java.util.List;

public class WaildCard {
	public static void main(String[] args) {
		List<Animal> ListOfAnimal = new ArrayList<>();
		ListOfAnimal.add(new Animal(1));
		ListOfAnimal.add(new Animal(2));
		
		List<Dog> ListOfDogs = new ArrayList<>();
		ListOfDogs.add(new Dog());
		ListOfDogs.add(new Dog());
		
		test(ListOfAnimal);
		test(ListOfDogs);//полиморфизм не работает
		
	
	}
	
	
	private static void test(List<? extends Animal > list) {
		for(Animal animal: list) {
			System.out.println(animal);
		}
		
	}

}
