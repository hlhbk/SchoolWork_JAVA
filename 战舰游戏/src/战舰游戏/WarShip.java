package ս����Ϸ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WarShip {
	String name;
	static List<Position> position;//ս������λ��
	static List<Position> hitPosition;//ս��������λ��
	int Warwidth=24;//ս�����
	int Warheight=10;//ս���߶�
	boolean life=true;//ս����������������ʱover
	int hitNum=0;//ս����������
	
	//��ʼ��ս�����ƣ��Լ����ܳ��ֵ�λ�ü��ϡ�
	public WarShip(String name) {
		// TODO Auto-generated constructor stub
		position=new ArrayList();
		hitPosition=new ArrayList();
	//	this.initPosition(p);
	}
	
	//�ж��ӵ��Ƿ���У������У��жϻ���λ�ã����������ģ�ս������Ϊfalse
	public String hitPanDuan(Position zidan){
		Position p0=this.CreatCurrentPos();
		//Position p0=new Position(0,0);
		String hitpos;
		if((p0.x<zidan.x) && (zidan.x<(p0.x+Warwidth/3)) && (p0.y<zidan.y)&&(zidan.y<(p0.y+Warheight))){
			hitpos="��������";
			this.hitPosition.add(p0);
			//this.hitPosition.add(hitpos);
			
		}else if((p0.x+(Warwidth/3)<zidan.x) && (zidan.x<(p0.x+Warwidth*2/3)) && (p0.y<zidan.y)&&
				(zidan.y<(p0.y+Warheight))){
			hitpos="��������";
			hitNum++;
			this.hitPosition.add(p0);
			//this.life=false;
			//this.hitPosition.add(hitpos);
		}else if((p0.x+(Warwidth*2/3)<zidan.x) && (zidan.x<(p0.x+Warwidth)) && (p0.y<zidan.y)&&
				(zidan.y<(p0.y+Warheight))){
			hitpos="��������";
			this.hitPosition.add(p0);
			//this.hitPosition.add(hitpos);
		}else{
			hitpos="δ����";
		}
		this.position.add(p0);
		//this.hitPosition.add(p0);
		return hitpos;
	}
	
	//��ʼ��ս���ƶ�λ�ü���
/*	public void initPosition(Position[] p){
		for(int i=0;i<p.length;i++){
			position.add(p[i]);
		}
	}*/
	//��ȡս����ǰλ��
	public Position CreatCurrentPos(){
		Random rr=new Random();
		Position pos=new Position(rr.nextInt(20),rr.nextInt(20));
		//int a=rr.nextInt(position.size());
		return pos;
	}

}