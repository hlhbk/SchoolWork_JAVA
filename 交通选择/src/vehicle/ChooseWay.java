package vehicle;
import java.util.*;
//总控制类，由用户输入出发地，目的地，和距离等三个信息，自动计算出三种方式所需的时间
public class ChooseWay {
	//Vehicle v;
	Scanner in;
	String startPlace;
	String destination;
	double distance;
	public void control(){
		in=new Scanner(System.in);
		System.out.println("请输入出发地");
		startPlace=in.next();
		System.out.println("请输入目的地");
		destination=in.next();
		System.out.println("请输入路程：");
		distance=in.nextDouble();
		System.out.println("从"+startPlace+"------到"+destination);
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
