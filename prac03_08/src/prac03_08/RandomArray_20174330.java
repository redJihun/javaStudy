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
		System.out.print("정수 몇 개?");
		int n = scanner.nextInt();
		
		if(n<1 && n>100) {
			System.out.print("1~100 사이로 입력하세요!");
			scanner.close();
			return;
		}
		int array[] = new int[n];
		
		for(int i=0; i<array.length; i++) {
			int randomNum = (int)(Math.random() * 100 + 1);
			// 변수 randomNum 의 값이 이미 배열 array[0]~array[i-1]에 있는지 검사(exist 함수 호출)
			if(exists(array, i, randomNum)) {
				i--;	//이미 동일한 값이 배열에 있음 ->
				// i 값이 for에서 증가 되므로 미리 감소시켜 i 값이 증가 되지 않게 함
				continue;
			}
			array[i] = randomNum;
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
			if(((i+1)%10) == 0)
				System.out.println();	// 정수 10개씩 출력 후 줄 바꿈.
		}
		scanner.close();
	}
}
