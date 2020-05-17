package base;

public class Car {
	private int id;
	
	//вложеный не статический класс 
	private class Motor{
		public void startMotor() {
			System.out.println("Motor start");
		}
	}
	
	public Car(int id) {
		this.id = id;
	}
	// статический вложенный класс (нет доступа к полям) // используються из вне
	public static  class Battery() {
		public void charge() {
			System.out.println("Motor start");
		}
	}
	
	public void start() {
		Motor motor = new Motor();
		
		motor.startMotor();
		
		final int x = 1;
		
		class SomeClass{
			public void ShomeMethod() {
				System.out.println(x);
				System.out.println(id);
			}
		}
		
		
		
		System.out.println("electrocar"+ id + "Start");
	}
}
