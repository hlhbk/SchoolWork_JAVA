//随机产生一个数，可以让多个人参加游戏，，猜到之前错误次数最少的为胜。
package W001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {//3人玩游戏
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
	public void GameResult(){//游戏结果
		int a,b,c;
		for(int i=0;i<SG.length;i++){
			
			System.out.println("player"+SG[i].index+" 的分数为:"+SG[i].score);
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
			System.out.println("player"+SG[0].index+"胜出");
		}else{
			for(int h=0;h<flag;h++){
				System.out.print("\t"+"player"+SG[h].index);
			}
			System.out.print("平手");
		}*/
		if(a==b && b==c){
			System.out.println("——————平手");
		}
		else if(a>b && b>c){
			System.out.println("player"+SG[0].index+"胜出");
		}else if(b>a && b>c){
			System.out.println("player"+SG[1].index+"胜出");
		}else if(c>a || c>b){
			System.out.println("player"+SG[2].index+"胜出");
		}else if(a==b || b>c){
			System.out.println("player"+SG[0].index+"和player"+SG[1].index+"同时胜出");
		}else if(b==c || b>a){
			System.out.println("player"+SG[1].index+"和player"+SG[2].index+"同时胜出");
		}else if(c==a || a>b){
			System.out.println("player"+SG[0].index+"和player"+SG[2].index+"同时胜出");
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
class SingleGame{//单人游戏
	int index;
	private int num;
	int score=100;
	public SingleGame(int index){
		Random rr=new Random();
		this.num=rr.nextInt(200);
		this.index=index;
		
	}
	public void playGame(){
		System.out.println("第"+this.index+"轮游戏开始");
		Scanner in=new Scanner(System.in);
		int player;
		int grade=0;
		while(true){
			System.out.println("请猜数(0~200)：");
			player=in.nextInt();
			grade+=2;
			if(player>this.num){
				System.out.println("猜错了，大于正确值");
			}
			if(player<this.num){
				System.out.println("猜错了，小于正确值");
			}
			if(player==this.num){
				System.out.println("恭喜你！猜对了");
				this.score-=grade;
				System.out.println("player"+this.index+" 的分数为:"+this.score);
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