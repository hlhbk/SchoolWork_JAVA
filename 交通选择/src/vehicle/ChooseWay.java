package vehicle;
import java.util.*;
//�ܿ����࣬���û���������أ�Ŀ�ĵأ��;����������Ϣ���Զ���������ַ�ʽ�����ʱ��
public class ChooseWay {
	//Vehicle v;
	Scanner in;
	String startPlace;
	String destination;
	double distance;
	public void control(){
		in=new Scanner(System.in);
		System.out.println("�����������");
		startPlace=in.next();
		System.out.println("������Ŀ�ĵ�");
		destination=in.next();
		System.out.println("������·�̣�");
		distance=in.nextDouble();
		System.out.println("��"+startPlace+"------��"+destination);
		Airplane a=new Airplane();
		a.workOut(distance);
		Highrail h=new Highrail();
		h.workOut(distance);
		HiRoad r=new HiRoad();
		r.workOut(distance);
		//v.
		
	}
	public static void main(String[] args){
		ChooseWay ch=new ChooseWay();
		ch.control();
	}

}
