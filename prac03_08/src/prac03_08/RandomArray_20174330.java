package prac03_08;

import java.util.Scanner;

public class RandomArray_20174330 {
	public static boolean exists(int a[], int to, int r) {
		for(int j=0; j<to; j++) {
			if(a[j] == r)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �� ��?");
		int n = scanner.nextInt();
		
		if(n<1 && n>100) {
			System.out.print("1~100 ���̷� �Է��ϼ���!");
			scanner.close();
			return;
		}
		int array[] = new int[n];
		
		for(int i=0; i<array.length; i++) {
			int randomNum = (int)(Math.random() * 100 + 1);
			// ���� randomNum �� ���� �̹� �迭 array[0]~array[i-1]�� �ִ��� �˻�(exist �Լ� ȣ��)
			if(exists(array, i, randomNum)) {
				i--;	//�̹� ������ ���� �迭�� ���� ->
				// i ���� for���� ���� �ǹǷ� �̸� ���ҽ��� i ���� ���� ���� �ʰ� ��
				continue;
			}
			array[i] = randomNum;
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
			if(((i+1)%10) == 0)
				System.out.println();	// ���� 10���� ��� �� �� �ٲ�.
		}
		scanner.close();
	}
}
