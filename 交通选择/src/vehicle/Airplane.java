package vehicle;
/*double toStation,double backStation,double takeTicket,
double checkTime,double waitTime,double speed,double kiloPrice*/
public class Airplane extends Vehicle implements Access{
//到达机场时间1.5小时，机场回去时间2个小时，取票时间6分钟，检票时间30分钟，候车时间30分钟，速度800km/h,票价0.75/km
	double distance;
	public Airplane() {
		// TODO Auto-generated constructor stub
		super("乘飞机",1.2,1.2,0.1,0.5,0.5,900,0.75);
	}

@Override
public void workOut(double distance) {
	// TODO Auto-generated method stub
	this.Compute(distance);
}

}
