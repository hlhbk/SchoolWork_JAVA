package vehicle;

public class HiRoad extends Vehicle implements Access{
	//到达高铁站时间0.8小时，高铁站回去时间0.8个小时，取票时间15分钟，检票时间15分钟，候车时间1.0分钟，速度90km/h,票价0.32/km
	public HiRoad() {
		// TODO Auto-generated constructor stub
		super("坐汽车",0.8,0.8,0.25,0.25,1.0,88,0.32);
	}

	@Override
	public void workOut(double distance) {
		// TODO Auto-generated method stub
		this.Compute(distance);
		
	}

}
