package middleTestPrac;

import java.util.*;

//p.127 CheckTime 1��
//public class Chap03 {
//	public static void main(String[] args) {
//		for(int i=5; i>0; i--) {
//			for(int j=0; j<i; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

//public class Chap03 {
//	public static void main(String[] args) {
//		int i=5;
//		int j=0;
//		while(i>0) {
//			while(j<i){
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			if(i==1) break;
//			j=0;
//			i--;
//		}
//	}
//}


//public class Chap03 {
//	public static void main(String[] args) {
//		int i=5;
//		int j=0;
//		do {
//			do{
//				System.out.print("*");
//				j++;
//			}while(j<i);
//			System.out.println();
//			j=0;
//			i--;
//		}while(i>0);
//	}
//}

////p.127 CheckTime 3��
//public class Chap03{
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=0; i<100; i++) {
//			if(i%3 == 0)
//				sum += i;
//		}
//		System.out.print(sum);
//	}
//}

////p.145 CheckTime 4��
//public class Chap03{
//	public static void main(String[] args) {
//		int array[][] = {{0,1,2,3}, {4}, {5}, {6, 7, 8, 9}};
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++)
//				System.out.print(array[i][j] + " ");
//			System.out.println();
//		}
//		
//	}
//}

////p.159 OpenChallenge
//public class Chap03{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int input=0, quizNum;
//		char retry=' ';
//		
//		while(true) {
//			quizNum = (int)((Math.random()*100)+1);
//			System.out.println("���� �����߽��ϴ�. ���߾� ������!(1~100 ���� ����)");
//			for(int i=1;;i++) {
//				System.out.print(i+" >> ");
//				input = scanner.nextInt();
//				if(input == quizNum) {
//					System.out.println("�����Դϴ�!");
//					break;
//				}
//				else if(input<quizNum)
//					System.out.println("�� ����");
//				else 
//					System.out.println("�� ����");
//			}
//			System.out.println("�ٽ� �Ͻðڽ��ϱ�?(y/n)");
//			retry = scanner.next().charAt(0);
//			if(retry=='n')
//				break;
//		}
//		scanner.close();
//	}
//}


public class Chap03{
	public static void main(String[] args) {
		char alpha[] = {'��','ȭ','��','��','��'};
		for(char c[]=alpha; )
	}
}
