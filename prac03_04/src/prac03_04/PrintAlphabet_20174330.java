package prac03_04;

import java.util.Scanner;

public class PrintAlphabet_20174330 {
	public static void main(String[] args) {
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		if(s.length() != 1) {
			System.out.print("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!");
			scanner.close();
			return;
		}
		
		if((c<'a') || (c>'z')) {
			System.out.print("�ҹ��� ���ĺ��� �ƴմϴ�.");
			scanner.close();
			return;
		}
		
		for(char i=c; i>='a'; i--) {
			for(char j='a'; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
		
		scanner.close();
	}
}
