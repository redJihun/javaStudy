package laterMiddle;

abstract class Mouse{
	abstract void move();
	abstract void scroll(); 
}

interface IRF {
	String RF_Type_IR="���ܼ�";
	String RF_Type_BT="�������";
	abstract void wconnect();
	abstract void wdisconnect();
 }
public class RFMouse extends Mouse implements IRF{   //   MouseŬ���� ����ϰ� IRF �� �����Ѵ�.

	public void move() { System.out.println( "���콺 ������");}
	public void scroll() { System.out.println( "���콺 ��ũ�� ����");}
	public void wconnect() { System.out.println( "���콺 ���� �����");}
	public void wdisconnect() { System.out.println( "���콺 ���� ���� ����");}
	
    public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		
		System.out.println("���� ��� : " + IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
    }
}
