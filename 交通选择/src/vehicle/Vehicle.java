package vehicle;
/*
 * ����ʱ��ͼ۸�
 *���ó��󷽷����
 *
 *��ͨ��ʽ
 *����վ��������ʱ�䣬�ӳ�վ������������ʱ�䣬ȡƱʱ�䣬����ʱ�䣬��ʱ�䣬���٣�
 *Ʊ�ۣ�����0.32/���� �����ȸ���0.45/���� ���ɻ�0.75/���
 * 
 * */
public class Vehicle {
	String type;
	double toStation;
	double backStation;
	double takeTicket;
	double checkTime;
	double waitTime;
	double speed;
	double kiloPrice;
	//double distance;
	public Vehicle(	String type,double toStation,double backStation,double takeTicket,
			double checkTime,double waitTime,double speed,double kiloPrice) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.toStation=toStation;
		this.backStation=backStation;
		this.takeTicket=takeTicket;
		this.checkTime=checkTime;
		this.waitTime=waitTime;
		this.speed=speed;
		this.kiloPrice=kiloPrice;
	//	this.distance=distance;
	}
	public void Compute(double distance){
		double time,price;
		time=this.toStation+this.backStation+this.takeTicket+this.checkTime+this.waitTime+(distance/speed);
		price=kiloPrice*distance;
		System.out.println(this.type+"����Ҫ��ʱ��Ϊ"+time);
		System.out.println(this.type+"�۸�Ϊ"+price);
	}
}
