package prac03_04;

import java.util.Scanner;

public class PrintAlphabet_20174330 {
	public static void main(String[] args) {
		
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		if(s.length() != 1) {
			System.out.print("알파벳 하나만 입력해야 합니다!");
			scanner.close();
			return;
		}
		
		if((c<'a') || (c>'z')) {
			System.out.print("소문자 알파벳이 아닙니다.");
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
