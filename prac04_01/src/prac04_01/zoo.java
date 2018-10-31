package prac04_01;

//class Animal{
//	String name;
//	int age;
//}
//
//public class zoo {
//	public static void main(String args[]) {
//		Animal Myanimal = new Animal();		// Animal(){}
//		Myanimal.name="cat";				// 실체화, 객체화
//		Myanimal.age=5;
//		Animal Myanimal2 = new Animal();		// Animal(){}
//		Myanimal2.name="lion";				// 실체화, 객체화
//		Myanimal2.age=7;
//		
//		System.out.println("My animal name is " + Myanimal.name);
//		System.out.println("My animal age is " + Myanimal.age);
//		System.out.println("My animal name is " + Myanimal2.name);
//		System.out.println("My animal age is " + Myanimal2.age);
//	}
//}


//class Animal{
//	String name;
//	int age;
//	public void ZooPrint() {
//		System.out.println("My animal name is " + this.name);
//		System.out.println("My animal age is " + this.age);
//	}
//}
//
//public class zoo {
//	public static void main(String args[]) {
//		Animal Myanimal = new Animal();		// Animal(){}
//		Myanimal.name="cat";				// 실체화, 객체화
//		Myanimal.age=5;
//		Myanimal.ZooPrint();
//		
//		Animal Myanimal2 = new Animal();		// Animal(){}
//		Myanimal2.name="lion";				// 실체화, 객체화
//		Myanimal2.age=7;
//		Myanimal2.ZooPrint();
//	}
//}


//class Animal{
//	String name;
//	int age;
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public void ZooPrint() {
//		System.out.println("My animal name is " + this.name);
//		System.out.println("My animal age is " + this.age);
//	}
//}
//
//public class zoo {
//	public static void main(String args[]) {
//		Animal Myanimal = new Animal("cat", 5);	
//		Animal Myanimal2 = new Animal("lion", 7);	
//		
//		Myanimal.ZooPrint();
//		Myanimal2.ZooPrint();
//	}
//}


//class Animal{
//	String name;
//	int age;
//	public Animal() {name="nobody"; age=99;} //default constructor,기본생성	// 오버로딩 - 메소드가 호출될때 인자 갯수의 차이등으로 구분
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public void ZooPrint() {
//		System.out.println("My animal name is " + this.name);
//		System.out.println("My animal age is " + this.age);
//	}
//}
//
//public class zoo {
//	public static void main(String args[]) {
//		Animal Myanimal = new Animal("cat", 5);	
//		Animal Myanimal2 = new Animal();
////		Myanimal2.name = "lion";
////		Myanimal2.age = 7;
//		
//		Myanimal.ZooPrint();
//		Myanimal2.ZooPrint();
//	}
//}


//class Animal{
//	private String name;
//	private int age;
//	public String getName() {return name;}	// 생성자에서 값을 주던가, 퍼블릭메소드로 받아오기
//	public int getAge() {return age;}
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public void ZooPrint() {
//		System.out.println("My animal name is " + this.name);
//		System.out.println("My animal age is " + this.age);
//	}
//}
//
//public class zoo {
//	public static void main(String args[]) {
//		Animal Myanimal = new Animal("cat", 5);	
//		Myanimal.ZooPrint();
//		System.out.println("My animal name is " + Myanimal.getName());
//		System.out.println("My animal age is " + Myanimal.getAge());
//	}
//}


//class Animal{
//	String name;
//	int age;
//	
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//}
//
//public class zoo {
//	public static void main(String args[]) {
//		Animal[] Myanimal = new Animal[3];
//			Myanimal[0] = new Animal("cat", 3);
//			Myanimal[1] = new Animal("lion", 7);
//			Myanimal[2] = new Animal("tiger", 5);
//			
//		for(int i=0; i<Myanimal.length; i++) {
//			System.out.println("My animal name is " + Myanimal[i].name);
//			System.out.println("My animal age is " + Myanimal[i].age);
//		}
//	}
//}


class Animal{
	private String name;
	private int age;
	public String getName() {return name;}
	public int getAge() {return age;}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class zoo {
	public static void main(String args[]) {
		Animal[] Myanimal = new Animal[3];
			Myanimal[0] = new Animal("cat", 3);
			Myanimal[1] = new Animal("lion", 7);
			Myanimal[2] = new Animal("tiger", 5);
			
		for(int i=0; i<Myanimal.length; i++) {
			System.out.println("My animal name is " + Myanimal[i].getName());
			System.out.println("My animal age is " + Myanimal[i].getAge());
		}
	}
}