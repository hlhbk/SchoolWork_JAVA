package W001;

import java.util.Scanner;
public class Auto{
	String size="劳斯莱斯";//汽车类型,名称
	float tank=20f;//汽车油量默认为20
	float oilConsump=3f;//...油耗/kilometer
	int distance;

	//构造汽车类时可将三个属性值传进去
	public Auto(String si,float ta,float oil){
		this.size=si;
		this.tank=ta;
		this.oilConsump=oil;
	}
	
	//显示汽车正在加油
	public void oiling(){
		if(tank<10){
			System.out.println(this.size+"is fueling up.....");
			this.tank=50;
		}else{
			System.out.println("there is no need for fueling!");		
		}
		System.out.println("加完操作后油箱油量为"+this.tank);
	}

	
	//传入参数汽车跑了多远，，输出跑了多远，，以及还剩下多少油
	public void running(int distance){
		System.out.println("当前油箱油量为"+this.tank);
		if(this.tank>distance*oilConsump){
			this.tank-=distance*oilConsump;
			System.out.println(this.size+"已经跑了"+distance+"kilometer");
			System.out.println("油箱还剩下汽油"+this.tank+"升");
		}else{
			
			System.out.println(this.size+"只能够跑了"+(int)(this.tank/oilConsump)+"kilometer");
			this.tank=0;
		}
		
		
	}

	//建立一个汽车类的数组，依次从键盘输入汽车类属性，，依次输出属性及其对方法的调用
	public static void main(String[] args){
		Auto[] cars=new Auto[5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入第"+(i+1)+"辆汽车的名称：");
			String ss=in.next();
			System.out.println("请输入第"+(i+1)+"辆汽车的油量：");
			float tt=in.nextFloat();
			System.out.println("请输入第"+(i+1)+"辆汽车的油耗：");
			float oo=in.nextFloat();
			cars[i]=new Auto(ss,tt,oo);
			System.out.println("请输入第"+(i+1)+"辆汽车跑的距离");
			cars[i].distance=in.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.println("第"+(i+1)+"辆汽车跑了"+cars[i].distance+"公里之后的情况");
			cars[i].running(cars[i].distance);
			cars[i].oiling();
			System.out.println();
		}
	}
}