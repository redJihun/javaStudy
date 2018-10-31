package algorythmHW01vol2;

import java.io.*;
import java.util.*;

public class lms181009 {
	//2���� �迭 ������ ���� �Լ�, OS���������� �����ϰ� OS������ ������ �̸������� ������
	public static void sortArray(Object[][] arr){
        Arrays.sort(arr, new Comparator<Object[]>() {	// OS ������ ����, OS ������ �̸��� ����
            public int compare(Object[] arr1, Object[] arr2) {
                if( ((Comparable)arr1[1]).compareTo(arr2[1]) < 0 )
                    return 1;
                if( ((Comparable)arr1[1]).compareTo(arr2[1]) == 0) {
                	Object t1 = arr1[0];
                    Object t2 = arr2[0];
                    return ((Comparable)t1).compareTo(t2);
                }
                else
                    return -1;
            }
        });
	}
	
	//���� ����� ���ϱ� ���� �Լ�, ���ٿ� �ִ� �������� ����� ������ main �Լ����� for������ �̿�
	public static double StudentAve(String[][] arr, int row) {
		double Ave = 0;
		for(int i=1; i<arr[row].length; i++)
			Ave = Ave + Double.valueOf(arr[row][i]);
		return Math.round(Ave/3);
	}
	
	//���� ����� ���ϱ� ���� �Լ�, menu�Ű������� 1�Է�-OS|2�Է�-DC|�׿�-CC
	public static double SubjectAve(String[][] arr, double Ave, int menu) {
		if(menu == 1) {
			for(int i=1; i<arr.length; i++)
				Ave = Ave + Double.valueOf(arr[i][1]);
			return Math.round(Ave/(arr.length-1));
		}
		if(menu == 2) {
			for(int i=1; i<arr.length; i++)
				Ave = Ave + Double.valueOf(arr[i][2]);
			return Math.round(Ave/(arr.length-1));
		}
		else {
			for(int i=1; i<arr.length; i++)
				Ave = Ave + Double.valueOf(arr[i][3]);
			return Math.round(Ave/(arr.length-1));
		}
	} 
	
	//�� ����� ���ϱ� ���� �Լ�, �� ������ ����� �Ű������� ����
	public static double TotalAve(double OS, double DC, double CC) {
		return (Math.round((OS+DC+CC)/3));
	}
	
	public static void main(String[] args) throws IOException{
		int i = 0;	// �ε����� �̿��� ����
		int aCount=0, bCount=0, cCount=0;	//�������� ���踦 ���� ����
		String line = "";	// ���� �� �� �о�� ���ڿ�
		String splitedLine[][] = new String[8][];	// OS������ �̸� ��� �񱳸� ���� ���߹迭
		double osAve=0, dcAve=0, ccAve=0, totalAve=0;	// �� ��� ���� ������ ���� ����
		
		/*******************************************/
		// os1.dat�� ����� ���� �ڵ�
		PrintWriter pwriter1 = new PrintWriter("./os1.dat");
		pwriter1.print("Name\tOS\tDC\tCC\r\n"
				+ "Lee\t60\t30\t40\r\n"
				+ "Kim\t90\t80\t90\r\n"
				+ "Bae\t90\t62\t89\r\n"
				+ "Park\t90\t90\t94\r\n"
				+ "Chun\t40\t50\t46\r\n"
				+ "Shin\t60\t70\t67\r\n"
				+ "Chun\t79\t92\t64");
		pwriter1.close();
		/*******************************************/
		
		/*******************************************/
		// ���ϰ�ü�� �Է������� �޾ƿ��� ��ĳ�ʷ� �Ѱ���
		// ��ĳ�ʷ� �Է������� ���پ� ������, ������ �и��Ͽ� 2�����迭�� ���� �� �л� ������� ����
		// ����� 2���� �迭 ����(OS���� ������ > ������ �̸���)
		// 2�����迭�� �̿��� �� ���� ��հ� ����� ���
		File file = new File("./os1.dat");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			splitedLine[i] = line.split("\t");
			i++;
		}
		scanner.close();
		sortArray(splitedLine);
		
//		for(i=0; i<splitedLine.length; i++) {
//			if(i==0) {
//				System.out.println(splitedLine[i][0] + "\t"
//						+ splitedLine[i][1] + "\t"
//						+ splitedLine[i][2] + "\t"
//						+ splitedLine[i][3] + "\t");
//			}
//			else {
//				System.out.println(splitedLine[i][0] + "\t"
//						+ splitedLine[i][1] + "\t"
//						+ splitedLine[i][2] + "\t"
//						+ splitedLine[i][3] + "\t"
//						+ StudentAve(splitedLine, i));
//			}
//		}	
		osAve = SubjectAve(splitedLine, osAve, 1);
		dcAve = SubjectAve(splitedLine, dcAve, 2);
		ccAve = SubjectAve(splitedLine, ccAve, 3);
		totalAve = TotalAve(osAve, dcAve, ccAve);
//		System.out.print(osAve +"\t" + dcAve +"\t" + ccAve +"\t" + totalAve);
		/*******************************************/
		
		/*******************************************/
		// ��������� �������� ǥ�⸦ ���� ����ġ���̽������� ����
		for(i=1; i<splitedLine.length; i++) {
			switch((int)Math.ceil(StudentAve(splitedLine, i)/10)) {
			case 0:	
			case 1: 
			case 2: 
			case 3: 
			case 4: cCount++; break;
			case 5:	
			case 6: 
			case 7: 
			case 8: bCount++; break;
			case 9:	
			case 10: aCount++; break;
			}
		}
		/*******************************************/
		
		/*******************************************/
		//���ĵ� 2���� �迭�� ����� ��� �� ������� ������ �ο� os2.dat�� ����
		PrintWriter pwriter2 = new PrintWriter("./os2.dat");
		
		pwriter2.println("No" + "\t" + splitedLine[0][0] + "\t"
						+ splitedLine[0][1] + "\t"
						+ splitedLine[0][2] + "\t"
						+ splitedLine[0][3] + "\t" + "Ave");
		
		for(i=1; i<splitedLine.length; i++) {
			pwriter2.println(i + "\t" + splitedLine[i][0] + "\t"
					+ splitedLine[i][1] + "\t"
					+ splitedLine[i][2] + "\t"
					+ splitedLine[i][3] + "\t"
					+ Double.toString(StudentAve(splitedLine, i)));
		}
		pwriter2.println("\r\n1-40: "+cCount+"\r\n41-80: "+bCount+"\r\n81-100: "+aCount);
		pwriter2.println("\r\nOS: "+osAve+"\tDC: "+dcAve+"\tCC: "+ccAve+"\tTotal AVE: "+totalAve);
		pwriter2.close();
		/*******************************************/
		
	}
}
