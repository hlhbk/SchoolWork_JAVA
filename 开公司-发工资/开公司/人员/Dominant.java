package ��Ա;

public class Dominant extends Person{
	double yearProfit;
	double stock;
	
	//�������ѯ��¼��
	public double getYearProfit() {
		return yearProfit;
	}
	public void setYearProfit(double yearProfit) {
		this.yearProfit = yearProfit;
	}
	
	//�ɶ���Ʊռ�Ȳ�ѯ��¼��
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	
	//��ʼ���ɶ��Ļ�����Ϣ����������Ϊ0
	public Dominant(String name,Date birth) {
		// TODO Auto-generated constructor stub
		super(name,0,birth);
	}
	
	//�ɶ�нˮ
	@Override
	public double pay(int m) {
		// TODO Auto-generated method stub
		if(m==12){
			return 0.1*yearProfit*stock;
		}
		return 0;
	}

}
