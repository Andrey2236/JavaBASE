package base;

public class ClassesAndObject {
	// только один публиный класс
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(-55);
		System.out.println("write main " + person1.getName());
		System.out.println("write main " + person1.getAge());

		person1.speak();
		System.out.println("MY name ");

		Person person2 = new Person();

		person2.setName("alla");
		int year1 = person2.Call();
		System.out.println(year1);
	}
}

//инкапсуляция нужна для сокрытия действий для пользователя
class Person {
	private String name;
	private int age;

	public void setName(String username) {
		if (username.isEmpty()) {
			System.out.println("ты ввел пустое имя");
		} else {
			name = username;
		}

	}

	public String getName() {
		return name;
	}

	public void setAge(int userAge) {
		if (userAge < 0) {
			System.out.println("возраст должен быть полажительным");
		} else {
			age = userAge;
		}

	}

	public int getAge() {
		return age;
	}

	int Call() {
		int years = 65 - age;
		return years;
	}

	void speak() {
		System.out.println("MY name" + name);

	}
	// у класса могут быть
	// 1. ДАННЫЕ поля
	// 2 действия (методы)
}

//class Test{
//	// вспомогательный класс
//}
