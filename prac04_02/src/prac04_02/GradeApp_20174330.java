package prac04_02;

import java.util.*;

class Grade{
	int math, science, english;
	
	public Grade() {}
	public Grade(int m, int s, int e) {
		this.math = m; this.science = s; this.english = e;
	}
	
	public int average() {return (this.math+this.science+this.english)/3;}
}

public class GradeApp_20174330 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("�����" + me.average());
		
		scanner.close();
	}
}
