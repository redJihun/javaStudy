package algorithmHW01;

import java.io.PrintWriter;
import java.util.Arrays;
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.Comparator;

class Student implements Comparable<Student>{	//Student Ŭ���� ����
	String name;
	int OS;
	int DC;
	int CC;
	double Ave;
	
	public int compareTo(Student stu) {	//Student ��ü�� OS ������ �����ϱ� ���� ����
		return stu.OS - this.OS;
	}
}

class StudentNameComparator implements Comparator<Student>{
	public int compare(Student stu1, Student stu2) {	//Student ��ü�� �̸��� ���� ���� ����
		String stuName1 = stu1.name;
		String stuName2 = stu2.name;
		if(stu1.OS == stu2.OS)	//OS ������ ���� ��쿡�� �̸�������
			return stuName1.compareToIgnoreCase(stuName2);
		else	return 0;
	}
}
public class hjh181007 {
	public static void main(String[] args) throws IOException{
		// os1.dat ������ ����
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
		
		Student students[] = new Student[7];	//�л� 7���� ������ �о���� ���� ��ü �迭 ����
		try {
			File file = new File("./os1.dat");	//os1.dat �� �ҷ��ͼ� FileŬ���� ��ü�� ����
			Scanner scanner = new Scanner(file);	//������ os1.dat�� ���� scanner�� ���� 
			System.out.println(scanner.nextLine());
			int i = 0;	//student ��ü �迭�� �̿��� �ε���
			while(scanner.hasNextLine()) {
				String[] splitedStr = scanner.nextLine().split("\t");	//scanner�� ������ ���� ������ ���پ� �дµ�, ������ �����ؼ� �迭�� ����
				System.out.println(splitedStr[0]+splitedStr[1]+splitedStr[2]+splitedStr[3]);
				students[i] = new Student();	//student ��ü �ʱ�ȭ
				students[i].name = splitedStr[0];
				students[i].OS = Integer.parseInt(splitedStr[1]);
				students[i].DC = Integer.parseInt(splitedStr[2]);
				students[i].CC = Integer.parseInt(splitedStr[3]);
				students[i].Ave = Math.round((double)(students[i].OS+students[i].DC+students[i].CC))/3;
				i++;
			}
			scanner.close();
			
			Arrays.sort(students);	//Student ��ü�� OS���� �� �������� ����
			Arrays.sort(students, new StudentNameComparator());	//Student ��ü�� �̸� �� �������� ����
			
			int aCount=0, bCount=0, cCount=0;	//�������� ���踦 ���� ����
			double osAve=0, dcAve=0, ccAve=0, totalAve=0;	//������� ����� ���� ����
			for(i=0; i<students.length; i++) {
				switch((int)Math.ceil(students[i].Ave/10)) {	//Ave�� �Ǽ��� �ʵ�� ����ȯ�ʿ�, ������ �ø��� ���� �������� ��������
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
				osAve += students[i].OS;	//��������� �ٴ��� ������ �ѹ��� students ��ü�迭�� ���̷� ������
				dcAve += students[i].DC;
				ccAve += students[i].CC;
				totalAve += students[i].Ave;
			}
			osAve = Math.round(osAve/students.length);
			dcAve = Math.round(dcAve/students.length);
			ccAve = Math.round(ccAve/students.length);
			totalAve = Math.round(totalAve/students.length);
			
			PrintWriter pw2 = new PrintWriter("./os2.dat");	// os2.dat�� ������ ������ ����
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
