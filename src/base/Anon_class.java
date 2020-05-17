package base;

interface AbleToEat{
	public void eat();
}
class Animal_a implements AbleToEat {
	public void eat() {
		System.out.println("eat");
	}
}

//class OtherAnimal extends Animal_a{
//	public void eat() {
//		System.out.println("Other Animal eat")
//	}// слишком сложен если вызываем обект 1 раз
//}




public class Anon_class {
	public static void main(String[] args) {
//		Animal_a animal = new Animal_a();
//		animal.eat();
//		
//		Animal_a animal2 = new Animal_a() {
//			public void eat() {
//				System.out.println("other animal eat");
//			}
//		}
//		
//		OtherAnimal oa = new OtherAnimal();
//		oa.eat();
		
		AbleToEat able  = new Animal_a();
		able.eat();
	}
}
