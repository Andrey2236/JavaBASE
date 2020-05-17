package base;

public enum Animal_Enume {
	DOG("собака"),CAT("Кошка"),FROG("Лягушка");
	
	private String translition;
	
	private Animal_Enume(String translition) {
		this.translition = translition;
	}// после создание конструктора джава не может создать объекты самостоятельно
	
	public String getTranslation() {
		return translition;
	}
}
