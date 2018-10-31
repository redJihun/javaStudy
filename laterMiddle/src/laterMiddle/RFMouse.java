package laterMiddle;

abstract class Mouse{
	abstract void move();
	abstract void scroll(); 
}

interface IRF {
	String RF_Type_IR="적외선";
	String RF_Type_BT="블루투스";
	abstract void wconnect();
	abstract void wdisconnect();
 }
public class RFMouse extends Mouse implements IRF{   //   Mouse클래스 상속하고 IRF 를 구현한다.

	public void move() { System.out.println( "마우스 움직임");}
	public void scroll() { System.out.println( "마우스 스크롤 동작");}
	public void wconnect() { System.out.println( "마우스 무선 연결됨");}
	public void wdisconnect() { System.out.println( "마우스 무선 연결 끊김");}
	
    public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		
		System.out.println("무선 방식 : " + IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
    }
}
