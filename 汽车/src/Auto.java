package W001;

import java.util.Scanner;
public class Auto{
	String size="��˹��˹";//��������,����
	float tank=20f;//��������Ĭ��Ϊ20
	float oilConsump=3f;//...�ͺ�/kilometer
	int distance;

	//����������ʱ�ɽ���������ֵ����ȥ
	public Auto(String si,float ta,float oil){
		this.size=si;
		this.tank=ta;
		this.oilConsump=oil;
	}
	
	//��ʾ�������ڼ���
	public void oiling(){
		if(tank<10){
			System.out.println(this.size+"is fueling up.....");
			this.tank=50;
		}else{
			System.out.println("there is no need for fueling!");		
		}
		System.out.println("�����������������Ϊ"+this.tank);
	}

	
	//��������������˶�Զ����������˶�Զ�����Լ���ʣ�¶�����
	public void running(int distance){
		System.out.println("��ǰ��������Ϊ"+this.tank);
		if(this.tank>distance*oilConsump){
			this.tank-=distance*oilConsump;
			System.out.println(this.size+"�Ѿ�����"+distance+"kilometer");
			System.out.println("���仹ʣ������"+this.tank+"��");
		}else{
			
			System.out.println(this.size+"ֻ�ܹ�����"+(int)(this.tank/oilConsump)+"kilometer");
			this.tank=0;
		}
		
		
	}

	//����һ������������飬���δӼ����������������ԣ�������������Լ���Է����ĵ���
	public static void main(String[] args){
		Auto[] cars=new Auto[5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("�������"+(i+1)+"�����������ƣ�");
			String ss=in.next();
			System.out.println("�������"+(i+1)+"��������������");
			float tt=in.nextFloat();
			System.out.println("�������"+(i+1)+"���������ͺģ�");
			float oo=in.nextFloat();
			cars[i]=new Auto(ss,tt,oo);
			System.out.println("�������"+(i+1)+"�������ܵľ���");
			cars[i].distance=in.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.println("��"+(i+1)+"����������"+cars[i].distance+"����֮������");
			cars[i].running(cars[i].distance);
			cars[i].oiling();
			System.out.println();
		}
	}
}