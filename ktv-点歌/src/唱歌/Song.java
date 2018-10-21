package 唱歌;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javazoom.jl.player.Player;

public class Song{
	/*String sName;
	String sPerson; 
	double time;*/
	FileInputStream in=null; 
	BufferedInputStream buffer=null;
	Player player=null;
	public static void main(String[] args){
		Song ss=new Song();
		//Thread thread=new Thread(ss);
		//ss.start();
		ss.play();
		System.out.println("5555");
	}
	/*public synchronized void run(){
		//super.start();
			this.play();	
	}*/
	public void play(){
		try{
			in=new FileInputStream("songs/接个吻，开一枪.mp3");
			buffer=new BufferedInputStream(in);
			player=new Player(buffer);
			player.play();
	}
		catch(Exception e){
			
		}

}
}