package 战舰游戏;

import java.util.Scanner;

public class WarGame {
	WarShip ship;
	Player player;
	Position[] p=new Position[9];
	public WarGame() {
		// TODO Auto-generated constructor stub
		/*p[0]=new Position(1,5);		p[3]=new Position(15,5);	p[6]=new Position(10,5);
		p[1]=new Position(10,5);	p[4]=new Position(3,2);	p[7]=new Position(7,8);
		p[2]=new Position(2,20);	p[5]=new Position(0,23);	p[8]=new Position(12,20);*/
		ship=new WarShip("青岚号");
		player=new Player();
	}
	
	//开炮一次
	public void startGame(){
		player.hit(ship);
	}
	
	//开炮多次，统计成绩以及记录
	public void ComputeAchevement(){
		int a=0,b=0,c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("请输入开炮次数：");
		int n=in.nextInt();
		System.out.println("炮击成绩：");
		for(int i=0;i<n;i++){
			this.startGame();
			System.out.println(player.achevement);
			if(player.achevement=="击中中心"){
				a++;
			}else if(player.achevement=="未击中"){
				b++;
			}else{
				c++;
			}
		}
		System.out.println("成绩如下————————");
		System.out.println("共开炮"+(a+b+c)+"次");
		System.out.println("击中"+(a+c)+"次\t"+"其中击沉"+a+"次");
		System.out.println("未击中"+b+"次");
		System.out.println("战舰位置：");
		for(int i=0;i<ship.position.size();i++){
			System.out.print("("+ship.position.get(i).x+","+ship.position.get(i).y+")\t");
		}
		
		System.out.println("\n战舰被击中位置：");
		for(int i=0;i<ship.hitPosition.size();i++){
			System.out.print("("+ship.hitPosition.get(i).x+","+ship.hitPosition.get(i).y+")\t");
		}
		System.out.println("\n开炮记录");
		for(int i=0;i<player.hitrecord.size();i++){
			System.out.print("("+player.hitrecord.get(i).x+","+player.hitrecord.get(i).y+")\t");
		}
	}
}
