package W001;

import java.io.PrintStream;

public class Job01 {

	public Job01() throws Exception{
		PrintStream p=new PrintStream("src/W001/Job01.txt");
		// TODO Auto-generated constructor stub
		String a="before";
		String b=a;
		System.out.println("�޸�b֮ǰaΪ��"+a);
		System.out.println("�޸�b֮ǰbΪ��"+a);
		b="after";
		
		System.out.println("�޸�b��ֵ֮�󡪡���������");//�޸ĺ�a��b��ֵ��һ��
		System.out.println("aΪ��"+a);
		System.out.println("bΪ��"+b);
		System.out.println(a.getClass()+"@"+a.hashCode());//�޸ĺ�a��b��hashcodeҲ��һ��
		System.out.println(b.getClass()+"@"+b.hashCode());
		System.out.println();
/*		A a=new A(10);
		A b=a;
		System.out.println("�޸�b֮ǰaΪ��"+a.getN());
		System.out.println("�޸�b֮ǰbΪ��"+b.getN());
		b.setN(100);
		System.out.println("�޸�b��ֵ֮�󡪡���������");
		System.out.println("aΪ��"+a.getN());//�޸ĺ�a��b��ֵһ��
		System.out.println("bΪ��"+b.getN());
		System.out.println(a.getClass()+"@"+a.hashCode());//�޸ĺ�a��b��hashcodeһ��
		System.out.println(b.getClass()+"@"+b.hashCode());
		*/
		
		////˵���������������������ڴ淽ʽ��һ���������������ֵ��������������ñ���
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new Job01();
	}

}
class A{
	int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	A(int n){
		this.n=n;
	}
}
