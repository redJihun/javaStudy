package algorithmMiddleTest;

public class prac01 {
	public static void Hanoi(int n, char from, char by, char to){
		if(n == 1)
			Move(from,to,n);
		else{
			Hanoi(n-1,from,to,by);
			Move(from,to,n);
			Hanoi(n-1,by,from,to);
		}
	}
	public static void Move(char a, char b, int n){
		System.out.println(n + "번째 원반을 이동 " + a + " -> " + b);
	}
	public static void main(String[] args) {
    	char a='a', b='b', c='c';
    	Hanoi(5, a, b, c);
    }
}
