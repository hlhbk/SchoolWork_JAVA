//�������һ�����������ö���˲μ���Ϸ�����µ�֮ǰ����������ٵ�Ϊʤ��
package W001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {//3������Ϸ
	SingleGame[] SG=new SingleGame[3];
	int max=0;
	public GuessGame() {
		// TODO Auto-generated constructor stub
		this.Play();
		this.GameResult();
	}
	public void Play(){
		for(int i=0;i<SG.length;i++){
			SG[i]=new SingleGame(i+1);
			SG[i].playGame();
		}
		System.out.println("GAME OVER!!!!!");

	}
	public void GameResult(){//��Ϸ���
		int a,b,c;
		for(int i=0;i<SG.length;i++){
			
			System.out.println("player"+SG[i].index+" �ķ���Ϊ:"+SG[i].score);
		}
		a=SG[0].score;
		b=SG[1].score;
		c=SG[2].score;
		/*int a=SG[0].bijiao(SG[1]);
		int b=SG[2].bijiao(SG[1]);
		int c=SG[0].bijiao(SG[2]);
		//System.out.println(a+"\t"+b+"\t"+c);
		int[] sss=new int[SG.length];
		for(int j=0;j<SG.length;j++){
			SG[j].score=sss[j];
		}
		Arrays.sort(sss);
		int flag=0;
		for(int k=0;k<SG.length;k++){
			if(SG[k]==SG[0]){
				flag+=1;
			}
		}
		if(flag==0){
			System.out.println("player"+SG[0].index+"ʤ��");
		}else{
			for(int h=0;h<flag;h++){
				System.out.print("\t"+"player"+SG[h].index);
			}
			System.out.print("ƽ��");
		}*/
		if(a==b && b==c){
			System.out.println("������������ƽ��");
		}
		else if(a>b && b>c){
			System.out.println("player"+SG[0].index+"ʤ��");
		}else if(b>a && b>c){
			System.out.println("player"+SG[1].index+"ʤ��");
		}else if(c>a || c>b){
			System.out.println("player"+SG[2].index+"ʤ��");
		}else if(a==b || b>c){
			System.out.println("player"+SG[0].index+"��player"+SG[1].index+"ͬʱʤ��");
		}else if(b==c || b>a){
			System.out.println("player"+SG[1].index+"��player"+SG[2].index+"ͬʱʤ��");
		}else if(c==a || a>b){
			System.out.println("player"+SG[0].index+"��player"+SG[2].index+"ͬʱʤ��");
		}
	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessGame();
		}

}
class SingleGame{//������Ϸ
	int index;
	private int num;
	int score=100;
	public SingleGame(int index){
		Random rr=new Random();
		this.num=rr.nextInt(200);
		this.index=index;
		
	}
	public void playGame(){
		System.out.println("��"+this.index+"����Ϸ��ʼ");
		Scanner in=new Scanner(System.in);
		int player;
		int grade=0;
		while(true){
			System.out.println("�����(0~200)��");
			player=in.nextInt();
			grade+=2;
			if(player>this.num){
				System.out.println("�´��ˣ�������ȷֵ");
			}
			if(player<this.num){
				System.out.println("�´��ˣ�С����ȷֵ");
			}
			if(player==this.num){
				System.out.println("��ϲ�㣡�¶���");
				this.score-=grade;
				System.out.println("player"+this.index+" �ķ���Ϊ:"+this.score);
				break;
			}
			
		}
	}
	/*public int bijiao(SingleGame p){
		if(this.score<p.score){
			return 1;
		}else if(this.score>p.score){
			return -1;
		}else if(this.score==p.score){
			return 0;
		}
		return 888;
	}*/
}