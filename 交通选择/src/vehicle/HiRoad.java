package vehicle;

public class HiRoad extends Vehicle implements Access{
	//�������վʱ��0.8Сʱ������վ��ȥʱ��0.8��Сʱ��ȡƱʱ��15���ӣ���Ʊʱ��15���ӣ���ʱ��1.0���ӣ��ٶ�90km/h,Ʊ��0.32/km
	public HiRoad() {
		// TODO Auto-generated constructor stub
		super("������",0.8,0.8,0.25,0.25,1.0,88,0.32);
	}

	@Override
	public void workOut(double distance) {
		// TODO Auto-generated method stub
		this.Compute(distance);
		
	}

}
