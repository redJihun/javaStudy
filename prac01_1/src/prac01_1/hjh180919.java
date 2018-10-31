package prac01_1;

//public class hjh180919 {
//	public static void main(String args[]) {
////		int array[];
////			array = new int [5];
////		int array[] = new int [5];
////		int array[] = {1,2,3,4,5};
//		double darray[] = new double[5];
//		char carray[] = new char[5];
////		=====================================
////		int array[] = new int [3][2];
////		int array[] = {{1,2},{3,4},{5,6}};
////		=====================================
//		int array[][] = new int [3][];
//			array[0] = new int [2];
//			array[1] = new int [1];
//			array[2] = new int [3];
//			
//		double d[][] = new double[3][];
//				d[0] = new double[3];
//				d[1] = new double[1];
//				d[2] = new double[3];
//	}
//}

//public class hjh180919 {
//	static int[] makeArray(){
//		int array[] = new int[5];
//		for(int i=0; i<array.length; i++)
//			array[i] = i+10;
//		return array;
//	}
//	public static void main(String args[]) {
//		int Rarray[];
//		Rarray = makeArray();
//		
//		for(int i=0; i<Rarray.length; i++)
//			System.out.println(Rarray[i]);
//	}
//}


public class hjh180919 {
	enum Week {Mon,Tue,Wed,Thur,Fri,Sat,Sun}
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[] = {"Apple","pea","Banana","Cherry"};
		
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;}
		System.out.println("sum= "+ sum);
//		=============================================
		for(String s : names)
			System.out.print(s + "s ");
		
		for(Week day : Week.values())
			System.out.print(day + "day ");
	}
}