//package prac01_1;

//public class hjh0910 {
//	public static void main(String args[]){
//		final double PI = 3.14;		// final => c, c++ �� #define ���� ����, int,ch,double ����Ʈ�� �˾ƵѰ�
//		double radius = 10;
//		double circleArea = 0;		// ��Ÿǥ���
//		
//		circleArea = radius * radius * PI;
//		System.out.print("Circle Area = ");
//		System.out.println(circleArea);
//	}
//}

//public class hjh0910 {
//	public static double Area(double d1, double d2) {
//		double area;
//		area = d1 * d1 * d2;
//		return area;
//	}
//	
//	public static void main(String args[]){
//		final double PI = 3.14;		// final => c, c++ �� #define ���� ����, int,ch,double ����Ʈ�� �˾ƵѰ�
//		double radius = 10;
//		
//		System.out.print("Circle Area = ");
//		System.out.println(Area(radius, PI));
//	}
//}

//public class hjh0910 {
//	public static double Area(double d1, double d2) {
//		double area;
//		area = d1 * d1 * d2;
//		return area;
//	}
//	
//	public static void main(String args[]){
//		final double PI = 3.14;		// final => c, c++ �� #define ���� ����, int,ch,double ����Ʈ�� �˾ƵѰ�
//		double radius = Double.parseDouble(args[0]);		//main ���ڰ�, ���� ����Ŭ������ �޼ҵ�
//		
//		System.out.print("Circle Area = ");
//		System.out.println(Area(radius, PI));
//	}
//}

//import java.util.Scanner;		//���迡 ������ ����!!! import
//public class hjh0910 {
//	public static double Area(double d1, double d2) {
//		double area;
//		area = d1 * d1 * d2;
//		return area;
//	}
//	
//	public static void main(String args[]){
//		Scanner scan = new Scanner(System.in);
//		
//		final double PI = 3.14;		// final => c, c++ �� #define ���� ����, int,ch,double ����Ʈ�� �˾ƵѰ�
//		double radius = 0;		//main ���ڰ�, ���� ����Ŭ������ �޼ҵ�
//		double circleArea = 0;
//		
//		System.out.print("Input Circle's Radius = ");
//		radius = scan.nextDouble();		//Scanner�� �޼ҵ�
//		
//		circleArea = Area(radius, PI);
//		System.out.print("Circle Area = ");
//		System.out.println(Area(radius, PI));
//	}
//}

//import java.util.Scanner;		//���迡 ������ ����!!! import
//public class hjh0910 {
//	public static double Area(double d1, double d2) {
//		double area;
//		area = d1 * d1 * d2;
//		return area;
//	}
//	
//	public static void main(String args[]){
//		Scanner scan = new Scanner(System.in);
//		
//		final double PI = 3.14;		// final => c, c++ �� #define ���� ����, int,ch,double ����Ʈ�� �˾ƵѰ�
//		double radius = 0;		//main ���ڰ�, ���� ����Ŭ������ �޼ҵ�
//		double circleArea = 0;
//		
//		System.out.print("What is your name? ");
//		System.out.println("My name is " + scan.next());
//		System.out.print("What is your school number? ");
//		System.out.println("My number is " + scan.nextInt());
//		System.out.print("What is your height? ");
//		System.out.println("My height is " + scan.nextDouble());
//		System.out.print("Are you Single(True/False)? ");
//		System.out.println("I'm a " + scan.nextBoolean());
//		System.out.println("=======================================");
//		
//		
//		System.out.print("Input Circle's Radius = ");
//		radius = scan.nextDouble();
//		
//		circleArea = Area(radius, PI);
//		System.out.print("Circle Area = ");
//		System.out.println(Area(radius, PI));
//		System.out.println("=======================================");
//		scan.close();
//	}
//}