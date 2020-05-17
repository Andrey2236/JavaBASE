package base;

public class String_bilder {
	public static void main(String[] args) {
		String x = "Hello"; 
		 x = x.toUpperCase(); //НЕ ИЗМЕНЯЮТ СТРОКУ Х А ВОЗВРАЩЯЮТ НОВУЮ 
		 System.out.println(x);
		 
		 String s1 = "my";
		 String s2 = "frind";
		 String sAll = x+s1+s2;
		 
		 System.out.println(sAll);
		 System.out.print(sAll);
		 System.out.printf("This is a string %s","hello"); //%d %(тип) вставить в строку
		 System.out.printf("String %10d \n", 44);
		 System.out.printf("String %.2f \n", 44.534534);
		 
		 StringBuilder sb = new StringBuilder("hello2");
		 
		 System.out.println(sb.toString());
		 sb.append(" my").append(" friend");
		 System.out.println(sb.toString());
		 
	
	}
}
