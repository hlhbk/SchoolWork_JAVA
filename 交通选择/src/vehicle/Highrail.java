package vehicle;

public class Highrail extends Vehicle implements Access{
	//�������վʱ��1.0Сʱ������վ��ȥʱ��1.0��Сʱ��ȡƱʱ��30���ӣ���Ʊʱ��15���ӣ���ʱ��20���ӣ��ٶ�300km/h,Ʊ��0.45/km
	public Highrail() {
		// TODO Auto-generated constructor stub
		super("������",1.0,1.0,0.5,0.25,0.33,280,0.45);
	}

	@Override
	public void workOut(double distance) {
		// TODO Auto-generated method stub
		this.Compute(distance);
	}

}
