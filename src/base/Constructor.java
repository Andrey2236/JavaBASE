package base;

public class Constructor {
	public static void main(String[] args) {
//		Humans human1 = new Humans("eric", 14);
//		human1.setName("Tom");
//		
	Humans h1 = new Humans("bob",15);
	Humans h2 = new Humans("andrey", 20);	
	
	Humans.description = "hello";
	h1.getAllField();
	h2.getAllField();
	Humans.description = "Sad";
	h1.getAllField();
	h2.getAllField();
	//Humans.getDescription();
	}
	// статические методы сущ изночально
	//статическая переменная создаеться один раз и делеться между всеми объектами этого класса  
}

class Humans {
	private String name;
	private int age;
	public static String description;
	
	public static void getDescription(){
		System.out.println(description);
		
	}

	public Humans() {
		//перегрузка методов методы с одинаковым названием до тех пор пока разные параметры 
		System.out.println("hello  construktor");
		//конструктор по умолчанию  (нету типа возвращаемого значения и  имя конструктора совподает с именем класса) 
	} 
	
	public Humans(String name) {
		System.out.println("2");
		this.name = name;
	}
	
	public  Humans(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;

	}
	public void getAllField() {
		System.out.println(name+","+age+","+description);
	}
}
