package 战舰游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
	static List<Position> hitrecord;//开炮记录
	String achevement;
	public Player() {
		// TODO Auto-generated constructor stub
		hitrecord=new ArrayList();
	}
	
	//打出一发子弹的结果:将结果赋值给achevement，，若击中中心，则将战舰life改为false
	public void hit(WarShip ship){
		Position zidan=this.CreateZidanLocat();
		//System.out.println("x"+zidan.x+"y"+zidan.y);
		achevement=ship.hitPanDuan(zidan);
		if(achevement=="击中中心"){
			ship.life=false;
		}
		hitrecord.add(zidan);
	}
	
	//子弹可能打中的范围在x,y  0~40  之间
	public Position CreateZidanLocat(){
		Random rr=new Random();
		Position p=new Position(rr.nextInt(40),rr.nextInt(40));
		return p;
	}

}
