package prac01_1;

//class Animal{
//	private String name;	// 접근지정자 private가 있으므로 공개된 메소드 필요.
//	private int age;
//	public Animal() {}
//	public Animal(String name, int age) 
//	{this.name = name;	this.age = age;}
//	public String getName() {return this.name;}
//	public int getAge() {return this.age;}
//}
//
//public class hjh181008 {
//	public static void main(String[] args) {
//		Animal myAnimal[] = new Animal[3];
//		myAnimal[0] = new Animal();
//		myAnimal[1] = new Animal("cat", 3);	
//		myAnimal[2] = new Animal("Tiger", 5);
//		
//		for(int i=0; i<myAnimal.length; i++) {
//			System.out.println(myAnimal[i].getName() + " " + myAnimal[i].getAge());
//		}
//	}
//}

//class SimpleCircle{
//	int radius;
//	static final double PI = 3.14159;		// static final 변수 만들기
//		// 생성자 만들기
//	public SimpleCircle(int radius) {this.radius = radius;}
//	public double getArea() {return radius*radius*PI;}
//}
//
//public class hjh181008{
//	public static void main(String[] args) {
//		SimpleCircle cc = new SimpleCircle(5);
//		System.out.println("원의 반지름은 : " + cc.radius);
//		System.out.println("원의 PI : " + cc.PI);
//		System.out.println("원의 PI : " + SimpleCircle.PI);
//		System.out.println("원의 넓이 : " + cc.getArea());
//	}
//}

//S_TV.txt

//class TV {
//	int size;
//	String manufacturer;
//	public TV() {
////		size=32;
////		manufacturer="LG";
//		this(32, "LG");
//		System.out.println(size + "Inch" + manufacturer);
//	}
//	public TV(String manufacturer) {
////		this.size=32;
////		this.manufacturer=manufacturer;
//		this(32, manufacturer);
//		System.out.println(size + "Inch" + manufacturer);
//	}
//	public TV(int size, String manufacturer) {
////		this.size=size;
////		this.manufacturer=manufacturer;
//		this(size, manufacturer);
//		System.out.println(size + "Inch" + manufacturer);
//	}
//}
//
//public class hjh181008{
//	public static void main(String[] args) {
//		
//	}
//}


class Power{
	public int kick;
	public int punch;
	public void setData(int kick, int punch) {
		this.kick = kick; this.punch = punch;
	}
}

public class hjh181008 {
 public static void main(String[] args) {
	  Power robot = new Power();
//	  robot.kick=10;
//	  robot.punch=20;
	  robot.setData(10, 20);
 	}
 }

