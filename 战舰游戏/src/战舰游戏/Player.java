package ս����Ϸ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
	static List<Position> hitrecord;//���ڼ�¼
	String achevement;
	public Player() {
		// TODO Auto-generated constructor stub
		hitrecord=new ArrayList();
	}
	
	//���һ���ӵ��Ľ��:�������ֵ��achevement�������������ģ���ս��life��Ϊfalse
	public void hit(WarShip ship){
		Position zidan=this.CreateZidanLocat();
		//System.out.println("x"+zidan.x+"y"+zidan.y);
		achevement=ship.hitPanDuan(zidan);
		if(achevement=="��������"){
			ship.life=false;
		}
		hitrecord.add(zidan);
	}
	
	//�ӵ����ܴ��еķ�Χ��x,y  0~40  ֮��
	public Position CreateZidanLocat(){
		Random rr=new Random();
		Position p=new Position(rr.nextInt(40),rr.nextInt(40));
		return p;
	}

}
