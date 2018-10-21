package W001;

import java.io.PrintStream;

public class Job01 {

	public Job01() throws Exception{
		PrintStream p=new PrintStream("src/W001/Job01.txt");
		// TODO Auto-generated constructor stub
		String a="before";
		String b=a;
		System.out.println("修改b之前a为："+a);
		System.out.println("修改b之前b为："+a);
		b="after";
		
		System.out.println("修改b的值之后——————");//修改后，a，b的值不一样
		System.out.println("a为："+a);
		System.out.println("b为："+b);
		System.out.println(a.getClass()+"@"+a.hashCode());//修改后，a，b的hashcode也不一样
		System.out.println(b.getClass()+"@"+b.hashCode());
		System.out.println();
/*		A a=new A(10);
		A b=a;
		System.out.println("修改b之前a为："+a.getN());
		System.out.println("修改b之前b为："+b.getN());
		b.setN(100);
		System.out.println("修改b的值之后——————");
		System.out.println("a为："+a.getN());//修改后，a，b的值一样
		System.out.println("b为："+b.getN());
		System.out.println(a.getClass()+"@"+a.hashCode());//修改后，a，b的hashcode一样
		System.out.println(b.getClass()+"@"+b.hashCode());
		*/
		
		////说明基本类对象和类对象存入内存方式不一样，基本类对象是值对象，类对象是引用变量
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
