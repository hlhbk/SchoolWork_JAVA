package ��Ա;

public class Staff extends Person{
	//��ʼ��Ա����Ϣ��Ա���Ļ������ʶ�Ϊ3000
	public Staff(String name,Date birth) {
		// TODO Auto-generated constructor stub
		super(name, 3000, birth);
		gift=500;
	}
	
	//Ա������ʵ�ʹ���
	@Override
	public double pay(int m) {
		// TODO Auto-generated method stub
		//����m���µĹ��ʣ���������Ա���������һǧ����Ϊ����
		if(m==this.birth.month){
			return salary+gift;
		}else{
			return salary;
		}	
	}
}
