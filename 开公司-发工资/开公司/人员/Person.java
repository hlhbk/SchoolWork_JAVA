package ��Ա;

public abstract class Person {
	String name;//����
	double salary;//��������
	Date birth;//����
	String title;//ְ��
	double gift=0;//����
	double reward=0;//����
	//��ʼ��������Ϣ
	public Person(String name,double salary,Date birth) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.salary=salary;
		this.birth=birth;
	}
	
	//���¹��ʼ���
	public abstract double pay(int m);
	
	//������н
	public double yearsalary(){
		double all=0;
		for(int i=1;i<13;i++){
			all=all+pay(i);
		}
		return all;
	}
	
	//toString ��д
	public String toString(){
		return name+"\t\t"+birth+"\t"+title+"\t\t"+salary;
	}

}
