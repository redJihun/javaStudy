package prac01_1;
//class Animal{
//	private String name;
//	private int age;
//	public Animal() {}
//	public Animal(String name, int age) {	//매개변수로 서로다름을 구분가능(오버로딩)
//		this.name=name;	this.age=age;
//	}
//}
//public class hjh181015 {
//	public static void main(String[] args) {
//		Animal zz = new Animal("cat", 7);
//		Animal zz1 = new Animal();
//	}
//}

//class Animal{
//	String name;
//	int age;
//	public void setData(String name, int age) {
//		name = name;
//		age = age;
//	}
//}
//
//class Animal2 extends Animal{
//	String color;
//}
//
//
// public class hjh181015{
//	 public static void main(String[] args) {
//		 Animal2 myAnimal = new Animal2();
//		 myAnimal.name = "cat";
//		 myAnimal.age = 3;
//		 myAnimal.color = "White";
//		 System.out.println(myAnimal.name);
//		 System.out.println(myAnimal.age);
//		 System.out.println(myAnimal.color);
//	 }
// }


//class Animal{
//	String name;
//	private int age;
//	public Animal() {}
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//}
//
//class Animal2 extends Animal{
//	String color;
//	
//	public Animal2(String color) {
//		this.color = color;
//	}
//}
//
//
// public class hjh181015{
//	 public static void main(String[] args) {
//		 Animal2 myAnimal = new Animal2("White");
//	 }
// }


//class Animal{
//	String name;
//	private int age;
//	public Animal() {this(null, 0);}
//	public Animal(String name, int age) {
//		this.name = name;	this.age = age;
//	}
//	public int getAge() {return age;}
//}
//
//class Animal2 extends Animal{
//	String color;
//	public Animal2() {super(" ", 5);	this.color = " ";}
//	public Animal2(String name, int age, String color) {super(name, age);	this.color = color;}
//}
//
//
// public class hjh181015{
//	 public static void main(String[] args) {
//		 Animal2 myAnimal = new Animal2("cat", 5, "White");
//		 System.out.println(myAnimal.name + myAnimal.getAge() + myAnimal.color);
//	 }
// }


//class Animal{
//	String name;
//	int age;
//	public Animal() {}
//	public Animal(String name, int age) {this.name = name;	this.age = age;}
//	public String print() {return this.name;}
//}
//
//class Animal2 extends Animal{
//	String name;
//	String color;
//	public Animal2(String name, String color) {this.name = name; this.color = color;}
//	public String print() {return (this.name+this.color);}
//}
//
//
// public class hjh181015{
//	 public static void main(String[] args) {
//		 Animal myAni;
//		 Animal2 myAni2 = new Animal2("Horse", "White");
//		 myAni = myAni2;	//upcasting
//		 System.out.println(myAni.name);
//		 System.out.println(myAni2.name);
//		 System.out.println(myAni.print());
//		 System.out.println(myAni2.print());
//		 myAni2.color = "violet";	// myAni.color = "red"; error
//	 }
// }


//class Animal{
//	String name;
//	int age;
//	int x = 10;		// 서브클래스와 같게
//	
//	public Animal() {}
//	public Animal(String name, int age) {this.name = name;	this.age = age;}
//	public String print() {return this.name;}
//}
//
//class Animal2 extends Animal{
//	String name;
//	String color;
//	int x = 20;
//	
//	public Animal2(String name, String color) {this.name = name; this.color = color;}
//	public String print() {return (this.name+this.color);}
//}
//
//
// public class hjh181015{
//	 public static void main(String[] args) {
//		 Animal myAni; 
//		 Animal2 myAni2 = new Animal2("Horse", "White");
//		 myAni = myAni2;
//		 
//		 System.out.println(myAni.x);
//		 System.out.println(myAni2.x);
//	 }
// }