//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		
//		if(score >= 80)
//			System.out.println("ㅊㅋㅊㅋ");
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		
//		if(score >= 80)
//			System.out.println("ㅊㅋㅊㅋ");
//		else
//			System.out.println("다음 기회에");
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		
//		if(score >= 80)
//			System.out.println("ㅊㅋㅊㅋ");
//		else
//			System.out.println("다음 기회에");
//		
//		String result = score>=80? "pass!" : "fail!";
//		System.out.println(result);
//		System.out.println(score>=80? "pass2!":"fail2!");
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is your score?");
//		int score = scan.nextInt();
//		char grade;
//		if(score >= 90)
//			grade = 'A';
//		else if(score >= 80)
//			grade = 'B';
//		else if(score >= 70)
//			grade = 'C';
//		else
//			grade = 'F';
//		
//		System.out.println("Your grade is " + grade);
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		char grade;
//		
//		while(true) {
//			System.out.print("What is your score?");
//			int score = scan.nextInt();
//			
//			if(score == 0) break;
//			if(score >= 90)
//				grade = 'A';
//			else if(score >= 80)
//				grade = 'B';
//			else if(score >= 70)
//				grade = 'C';
//			else
//				grade = 'F';
//			System.out.println("Your grade is " + grade);
//			
//			if((score>=80)&&(score<=100))
//				System.out.println("유학보내줌");
//			else
//				System.out.println("집에가");
//		}
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		char grade;
//		while(true) {
//			System.out.print("What is your score?");
//			int score = scan.nextInt();
//			
//			if(score == 0)	break;
//			switch(score/10) {
//			case 10: 
//			case 9: grade='A';	break;
//			case 8: grade='B';	break;
//			case 7: grade='C';	break;
//			default: grade='F';
//			}
//			
//			System.out.println("Your grade is " + grade);
//		}
//		scan.close();
//	}
//}


//package prac01_1;
//import java.util.Scanner;
//public class hjh180912 {		// 112p. 11번
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		String grade;
//		
//		System.out.print("몇 월 입니까?");
//		int month = scan.nextInt();
//		
//		if((month>=3) && (month<=5))
//			System.out.println("봄입니다!");
//		else if((month>=6) && (month<=8))
//			System.out.println("여름입니다!");
//		else if((month>=9) && (month<=11))
//			System.out.println("가을입니다!");
//		else if((month==12)||(month==1)||(month==2))
//			System.out.println("겨울입니다!");
//		else
//			System.out.println("잘못 입력했습니다!");
//		
//		scan.close();
//	}
//}

package prac01_1;
import java.util.Scanner;
public class hjh180912 {		// 112p. 11번
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String season;
		
		System.out.print("몇 월 입니까?");
		int month = scan.nextInt();
		
		switch(month) {
		case 12: season = "겨울입니다";	break;
		case 11:
		case 10:
		case 9: season = "가을입니다"; break;
		case 8:
		case 7:
		case 6: season = "여름입니다";	break;
		case 5:
		case 4:
		case 3: season = "봄입니다";	break;
		case 2:
		case 1: season = "겨울입니다";	break;
		default: season = "잘못입력했습니다!"; break;
		}
		
		System.out.println(season);
		
		scan.close();
	}
}