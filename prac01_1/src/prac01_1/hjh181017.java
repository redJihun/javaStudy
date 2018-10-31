package prac01_1;


class Animal{
	String name;
	int age;
	int x = 10;		// 서브클래스와 같게
	
	public Animal() {}
	public Animal(String name, int age) {this.name = name;	this.age = age;}
	public String print() {return this.name;}
}

class Animal2 extends Animal{
	String name;
	String color;
	int x = 20;
	
	public Animal2() {}
	public Animal2(String name, String color) {this.name = name; this.color = color;}
	public String print() {return (this.name+this.color);}
}

class Animal3 extends Animal2{public Animal3() {}}
public class hjh181017{
	 public static void main(String[] args) {
		Animal my1 = new Animal();
		Animal my2 = new Animal2();
		Animal my3 = new Animal3();
		
		if(my1 instanceof Animal)
			System.out.println("Animal class Type");
		if(my2 instanceof Animal)
			System.out.println("Animal2 class Type");
		if(my3 instanceof Animal)
			System.out.println("Animal3 class Type");
		System.out.println();
	 }
}


 