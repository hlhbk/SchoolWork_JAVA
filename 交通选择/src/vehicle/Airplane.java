package vehicle;
/*double toStation,double backStation,double takeTicket,
double checkTime,double waitTime,double speed,double kiloPrice*/
public class Airplane extends Vehicle implements Access{
//�������ʱ��1.5Сʱ��������ȥʱ��2��Сʱ��ȡƱʱ��6���ӣ���Ʊʱ��30���ӣ���ʱ��30���ӣ��ٶ�800km/h,Ʊ��0.75/km
	double distance;
	public Airplane() {
		// TODO Auto-generated constructor stub
		super("�˷ɻ�",1.2,1.2,0.1,0.5,0.5,900,0.75);
	}

@Override
public void workOut(double distance) {
	// TODO Auto-generated method stub
	this.Compute(distance);
}

}
