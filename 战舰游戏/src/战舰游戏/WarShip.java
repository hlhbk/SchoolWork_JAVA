package 战舰游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WarShip {
	String name;
	static List<Position> position;//战舰航行位置
	static List<Position> hitPosition;//战舰被击中位置
	int Warwidth=24;//战舰宽度
	int Warheight=10;//战舰高度
	boolean life=true;//战舰生命，击中中心时over
	int hitNum=0;//战舰击沉次数
	
	//初始化战舰名称，以及可能出现的位置集合。
	public WarShip(String name) {
		// TODO Auto-generated constructor stub
		position=new ArrayList();
		hitPosition=new ArrayList();
	//	this.initPosition(p);
	}
	
	//判断子弹是否击中，若击中，判断击中位置，若击中中心，战舰生命为false
	public String hitPanDuan(Position zidan){
		Position p0=this.CreatCurrentPos();
		//Position p0=new Position(0,0);
		String hitpos;
		if((p0.x<zidan.x) && (zidan.x<(p0.x+Warwidth/3)) && (p0.y<zidan.y)&&(zidan.y<(p0.y+Warheight))){
			hitpos="击中左舷";
			this.hitPosition.add(p0);
			//this.hitPosition.add(hitpos);
			
		}else if((p0.x+(Warwidth/3)<zidan.x) && (zidan.x<(p0.x+Warwidth*2/3)) && (p0.y<zidan.y)&&
				(zidan.y<(p0.y+Warheight))){
			hitpos="击中中心";
			hitNum++;
			this.hitPosition.add(p0);
			//this.life=false;
			//this.hitPosition.add(hitpos);
		}else if((p0.x+(Warwidth*2/3)<zidan.x) && (zidan.x<(p0.x+Warwidth)) && (p0.y<zidan.y)&&
				(zidan.y<(p0.y+Warheight))){
			hitpos="击中右舷";
			this.hitPosition.add(p0);
			//this.hitPosition.add(hitpos);
		}else{
			hitpos="未击中";
		}
		this.position.add(p0);
		//this.hitPosition.add(p0);
		return hitpos;
	}
	
	//初始化战舰移动位置集合
/*	public void initPosition(Position[] p){
		for(int i=0;i<p.length;i++){
			position.add(p[i]);
		}
	}*/
	//获取战舰当前位置
	public Position CreatCurrentPos(){
		Random rr=new Random();
		Position pos=new Position(rr.nextInt(20),rr.nextInt(20));
		//int a=rr.nextInt(position.size());
		return pos;
	}

}