package vehicle;
/*
 * 计算时间和价格
 *调用抽象方法输出
 *
 *交通方式
 *到车站（机场）时间，从车站（机场）返回时间，取票时间，安检时间，候车时间，车速，
 *票价（汽车0.32/公里 ，二等高铁0.45/公里 ，飞机0.75/公里）
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
		System.out.println(this.type+"所需要的时间为"+time);
		System.out.println(this.type+"价格为"+price);
	}
}
