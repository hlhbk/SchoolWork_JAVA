package ս����Ϸ;

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
		ship=new WarShip("��᰺�");
		player=new Player();
	}
	
	//����һ��
	public void startGame(){
		player.hit(ship);
	}
	
	//���ڶ�Σ�ͳ�Ƴɼ��Լ���¼
	public void ComputeAchevement(){
		int a=0,b=0,c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("�����뿪�ڴ�����");
		int n=in.nextInt();
		System.out.println("�ڻ��ɼ���");
		for(int i=0;i<n;i++){
			this.startGame();
			System.out.println(player.achevement);
			if(player.achevement=="��������"){
				a++;
			}else if(player.achevement=="δ����"){
				b++;
			}else{
				c++;
			}
		}
		System.out.println("�ɼ����¡���������������");
		System.out.println("������"+(a+b+c)+"��");
		System.out.println("����"+(a+c)+"��\t"+"���л���"+a+"��");
		System.out.println("δ����"+b+"��");
		System.out.println("ս��λ�ã�");
		for(int i=0;i<ship.position.size();i++){
			System.out.print("("+ship.position.get(i).x+","+ship.position.get(i).y+")\t");
		}
		
		System.out.println("\nս��������λ�ã�");
		for(int i=0;i<ship.hitPosition.size();i++){
			System.out.print("("+ship.hitPosition.get(i).x+","+ship.hitPosition.get(i).y+")\t");
		}
		System.out.println("\n���ڼ�¼");
		for(int i=0;i<player.hitrecord.size();i++){
			System.out.print("("+player.hitrecord.get(i).x+","+player.hitrecord.get(i).y+")\t");
		}
	}
}
