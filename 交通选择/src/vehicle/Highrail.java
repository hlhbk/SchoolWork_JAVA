package vehicle;

public class Highrail extends Vehicle implements Access{
	//到达高铁站时间1.0小时，高铁站回去时间1.0个小时，取票时间30分钟，检票时间15分钟，候车时间20分钟，速度300km/h,票价0.45/km
	public Highrail() {
		// TODO Auto-generated constructor stub
		super("坐高铁",1.0,1.0,0.5,0.25,0.33,280,0.45);
	}

	@Override
	public void workOut(double distance) {
		// TODO Auto-generated method stub
		this.Compute(distance);
	}

}
