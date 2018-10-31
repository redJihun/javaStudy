package prac01_1;

import java.util.Scanner;

//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.println("input value (x, y)");
//		System.out.print("x >>>>> ");
//		int x = scan.nextInt();
//		System.out.print("y >>>>> ");
//		int y = scan.nextInt();
//		
//		if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//			System.out.println("(" + x + "," + y + ") is inside of the square.");
//		else 
//			System.out.println("(" + x + "," + y + ") is outside of the square.");
//	
//		scan.close();
//	}
//}

//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0; i<3; i++) {	// 무한루프 for(int i=0;;i++)	for(int i=0;true;i++)
//			System.out.println("input value (x, y)");
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//		}
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("input value (x, y)");
//		for(int i=0; i<3; i++, System.out.println("input value (x, y)")) {	// 무한루프 for(int i=0;;i++)	for(int i=0;true;i++)
//			
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//			if(i==2) break;
//		}
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("input value (x, y)");
//		for(int i=0; i<5; i+=2, System.out.println("input value (x, y)")) {	// 무한루프 for(int i=0;;i++)	for(int i=0;true;i++)
//			
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//			System.out.println("i의  현재값 = "+i);
//			if(i==4) break;
//		}
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		int i = 0;
//		while(true) {	// 말미에 조건문이 있어서 무한루프아님
//			System.out.println("input value (x, y)");
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//			
//			System.out.println("i의  현재값 = "+ i);
//			if(i==2) break;
//			else i++;
//		}
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		int i = 0;
//		while(true) {	// 말미에 조건문이 있어서 무한루프아님
//			System.out.println("input value (x, y)");
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x<0) || (y<0)) break;
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//			
//			System.out.println("i의  현재값 = "+ i++);
//		}
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		int i=0;
//		do {
//			System.out.println("input value (x, y)");
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
////			System.out.println("i의  현재값 = "+ i++);
//			System.out.println("i의  현재값 = "+ i);
//		}while(++i<3);
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		do {	// do while 문은 적어도 1번은 실행되고 조건을 비교함(while과 다른점)
//			System.out.println("input value (x, y)");
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//			
//			if((x<0) || (y<0)) break;
//		}while(true);
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0; i<7; i++) {
//			if((i%2) != 0) continue;
//			System.out.println("input value (x, y)");
//			System.out.print("x >>>>> ");
//			int x = scan.nextInt();
//			System.out.print("y >>>>> ");
//			int y = scan.nextInt();
//			
//			if((x>=100) && (x<=200) && (y>=100) && (y<=200)) 
//				System.out.println("(" + x + "," + y + ") is inside of the square.");
//			else 
//				System.out.println("(" + x + "," + y + ") is outside of the square.");
//			
//			System.out.println("i의  현재값 = "+ i);
//		}	
//		scan.close();
//	}
//}


//public class hjh180917 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		int array[] = new int [5];
//		int sum = 0;
//		
//		for(int i=0; i<array.length; i++) {
//			System.out.print("배열의 " + (i+1) + "번 째에 들어갈 수를 입력하시오 : ");
//			array[i] = scan.nextInt();
//		}
//		for(int i=0; i<array.length; i++)
//			sum += array[i];	// => sum = sum + array[i];
//		
//		System.out.println("배열의 합은 " + sum + ", 평균은 " + (double)sum/array.length);
//		scan.close();
//	}
//}


public class hjh180917 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int array[] = new int [5];
		int array2[] = array;
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			System.out.print("배열의 " + (i+1) + "번 째에 들어갈 수를 입력하시오 : ");
			array[i] = scan.nextInt();
		}
		for(int i=0; i<array.length; i++)
			sum += array[i];	// => sum = sum + array[i];
		
		System.out.println("배열의 합은 " + sum + ", 평균은 " + (double)sum/array.length);
		
		for(int i=0; i<array2.length; i++) {
			array2[i] = array2[i] + 10;
			System.out.println("Array2 values = " + array2[i]);
		}
		for(int i=0; i<array.length; i++) {
			sum += array[i];	// => sum = sum + array[i];
			System.out.println("Array values = " + array[i]);
		}
		scan.close();
	}
}