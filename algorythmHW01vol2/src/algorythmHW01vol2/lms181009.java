package algorythmHW01vol2;

import java.io.*;
import java.util.*;

public class lms181009 {
	//2차원 배열 정렬을 위한 함수, OS점수순으로 정렬하고 OS점수가 동점시 이름순으로 정렬함
	public static void sortArray(Object[][] arr){
        Arrays.sort(arr, new Comparator<Object[]>() {	// OS 점수순 정렬, OS 동점시 이름순 정렬
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
	
	//개인 평균을 구하기 위한 함수, 한줄에 있는 점수들의 평균을 구해줌 main 함수에서 for문으로 이용
	public static double StudentAve(String[][] arr, int row) {
		double Ave = 0;
		for(int i=1; i<arr[row].length; i++)
			Ave = Ave + Double.valueOf(arr[row][i]);
		return Math.round(Ave/3);
	}
	
	//과목 평균을 구하기 위한 함수, menu매개변수에 1입력-OS|2입력-DC|그외-CC
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
	
	//총 평균을 구하기 위한 함수, 각 과목의 평균을 매개변수로 받음
	public static double TotalAve(double OS, double DC, double CC) {
		return (Math.round((OS+DC+CC)/3));
	}
	
	public static void main(String[] args) throws IOException{
		int i = 0;	// 인덱스로 이용할 변수
		int aCount=0, bCount=0, cCount=0;	//점수분포 집계를 위한 변수
		String line = "";	// 파일 한 줄 읽어올 문자열
		String splitedLine[][] = new String[8][];	// OS점수와 이름 대소 비교를 위한 이중배열
		double osAve=0, dcAve=0, ccAve=0, totalAve=0;	// 각 평균 점수 저장을 위한 변수
		
		/*******************************************/
		// os1.dat을 만들기 위한 코드
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
		// 파일객체로 입력파일을 받아오고 스캐너로 넘겨줌
		// 스캐너로 입력파일을 한줄씩 읽으며, 탭으로 분리하여 2차원배열에 저장 및 학생 개인평균 저장
		// 저장된 2차원 배열 정렬(OS과목 점수순 > 동점자 이름순)
		// 2차원배열을 이용해 각 과목 평균과 총평균 계산
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
		// 개인평균의 점수분포 표기를 위해 스위치케이스문으로 집계
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
		//정렬된 2차원 배열과 계산한 평균 및 개인평균 구간별 인원 os2.dat에 저장
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
