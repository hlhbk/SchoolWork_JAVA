package ��Ա;

public class Manager extends Person{
	double monthProfit;//�����۶�
	
	public void setMonthProfit(double monthProfit) {
		this.monthProfit = monthProfit;
	}
	//��ʼ��������Ϣ����������Ϊ5000
	public Manager(String name,Date birth) {
		// TODO Auto-generated constructor stub
		super(name,5000,birth);
		gift=1000;
		
	}
	
	public void setReward(){
		this.reward=0.01*this.monthProfit;
	}
	//������ʵ��нˮ
	@Override
	public double pay(int m) {
		// TODO Auto-generated method stub
		if(m==this.birth.month){
			return salary+reward+gift;
		}else{
			return salary+reward;
		}
	}

}
