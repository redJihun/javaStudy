package algorithmHW01;

import java.io.PrintWriter;
import java.util.Arrays;
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.Comparator;

class Student implements Comparable<Student>{	//Student 클래스 정의
	String name;
	int OS;
	int DC;
	int CC;
	double Ave;
	
	public int compareTo(Student stu) {	//Student 객체의 OS 점수로 정렬하기 위해 선언
		return stu.OS - this.OS;
	}
}

class StudentNameComparator implements Comparator<Student>{
	public int compare(Student stu1, Student stu2) {	//Student 객체의 이름순 정렬 위해 선언
		String stuName1 = stu1.name;
		String stuName2 = stu2.name;
		if(stu1.OS == stu2.OS)	//OS 점수가 같을 경우에만 이름순정렬
			return stuName1.compareToIgnoreCase(stuName2);
		else	return 0;
	}
}
public class hjh181007 {
	public static void main(String[] args) throws IOException{
		// os1.dat 파일을 생성
		PrintWriter pw = new PrintWriter("./os1.dat");
		pw.println("Name\tOS\tDC\tCC");
		pw.println("Lee\t60\t30\t40");
		pw.println("Kim\t90\t80\t90");
		pw.println("Bae\t90\t62\t89");
		pw.println("Park\t90\t90\t94");
		pw.println("Chun\t40\t50\t46");
		pw.println("Shin\t60\t70\t67");
		pw.println("Chung\t79\t92\t64");
		pw.close();
		
		Student students[] = new Student[7];	//학생 7명의 점수를 읽어오기 위해 객체 배열 선언
		try {
			File file = new File("./os1.dat");	//os1.dat 을 불러와서 File클래스 객체에 저장
			Scanner scanner = new Scanner(file);	//저장한 os1.dat의 정보 scanner에 저장 
			System.out.println(scanner.nextLine());
			int i = 0;	//student 객체 배열에 이용할 인덱스
			while(scanner.hasNextLine()) {
				String[] splitedStr = scanner.nextLine().split("\t");	//scanner에 저장한 파일 정보를 한줄씩 읽는데, 탭으로 구분해서 배열에 저장
				System.out.println(splitedStr[0]+splitedStr[1]+splitedStr[2]+splitedStr[3]);
				students[i] = new Student();	//student 객체 초기화
				students[i].name = splitedStr[0];
				students[i].OS = Integer.parseInt(splitedStr[1]);
				students[i].DC = Integer.parseInt(splitedStr[2]);
				students[i].CC = Integer.parseInt(splitedStr[3]);
				students[i].Ave = Math.round((double)(students[i].OS+students[i].DC+students[i].CC))/3;
				i++;
			}
			scanner.close();
			
			Arrays.sort(students);	//Student 객체의 OS점수 비교 내림차순 정렬
			Arrays.sort(students, new StudentNameComparator());	//Student 객체의 이름 비교 오름차순 정렬
			
			int aCount=0, bCount=0, cCount=0;	//점수분포 집계를 위한 변수
			double osAve=0, dcAve=0, ccAve=0, totalAve=0;	//점수평균 계산을 위한 변수
			for(i=0; i<students.length; i++) {
				switch((int)Math.ceil(students[i].Ave/10)) {	//Ave는 실수형 필드라 형변환필요, 나누고 올림을 통해 정상적인 분포집계
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
				osAve += students[i].OS;	//점수평균은 다더한 총합을 한번에 students 객체배열의 길이로 나눠줌
				dcAve += students[i].DC;
				ccAve += students[i].CC;
				totalAve += students[i].Ave;
			}
			osAve = Math.round(osAve/students.length);
			dcAve = Math.round(dcAve/students.length);
			ccAve = Math.round(ccAve/students.length);
			totalAve = Math.round(totalAve/students.length);
			
			PrintWriter pw2 = new PrintWriter("./os2.dat");	// os2.dat에 산출한 정보들 쓰기
			pw2.println("No\tName\tOS\tDC\tCC\tAve");
			for(i=0; i<students.length; i++) {
				pw2.println((i+1)+"\t"+students[i].name+"\t"+students[i].OS+"\t"+students[i].DC+"\t"+students[i].CC+"\t"+students[i].Ave);
			}
			pw2.println("\r\n1-40: "+cCount+"\r\n41-80: "+bCount+"\r\n81-100: "+aCount);
			pw2.println("\r\nOS: "+osAve+"\tDC: "+dcAve+"\tCC: "+ccAve+"\tTotal AVE: "+totalAve);
			pw2.close();
		}catch(FileNotFoundException fnfe) {System.out.println("FNFE");}
		catch(NullPointerException npe) {System.out.println("NPE");}
	}
}
