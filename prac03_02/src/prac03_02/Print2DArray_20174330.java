package prac03_02;

public class Print2DArray_20174330 {
	public static void main(String[] args) {
		int n[][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2} };
		// ���� 3-11 �ϴ� ����
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print( n[i][j]+ "\t");
			}
			System.out.println();	// �� �ٲٱ� ���
		}
	}	// main()
}	// class Print2DArray
