package base;

public class Animal {
	private int id;

	public Animal() {

	}

	public Animal(int id) {
		this.id = id;
	}

	String name;

	public String toString() {
		return String.valueOf(id);
	}

	public void eat() {
		System.out.println("i am eating");
	}

	public void sleep() {
		System.out.println("a Sleap");
	}
}
