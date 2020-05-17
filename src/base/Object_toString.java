package base;

public class Object_toString {
	public static void main(String[] args) {
		String string = "helo";// класс наследуеться от объекта object
		System.out.println(string);// toString() - возвращает хеш код

		humans1 h1 = new humans1();
		System.out.println(h1.tooString());
	}

}

class humans1 {
  public String age = "dsfsf" ;

	public String tooString() {
		return age;
	}
}