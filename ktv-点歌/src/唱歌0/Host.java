package 唱歌0;

import java.util.ArrayList;
import java.util.List;

public class Host {
	static List<Song> listSong;
		// TODO Auto-generated constructor stub
	public Host(){
		this.listSong=new ArrayList();
		Song s1=new Song("不再见","陈学冬");s1.setLastTime(2.80);s1.setRoute("songs/陈学冬-不再见.mp3");
		Song s2=new Song("接个吻","开一枪");s2.setLastTime(3.80);s1.setRoute("songs/接个吻，开一枪.mp3");
		Song s3=new Song("想太多","李玖哲");s3.setLastTime(4.20);s1.setRoute("songs/李玖哲-想太多.mp3");
		Song s4=new Song("末班车","刘思涵");s4.setLastTime(3.50);s1.setRoute("songs/刘思涵-末班车.mp3");
		Song s5=new Song("像风一样","薛之谦");s5.setLastTime(4.05);s1.setRoute("songs/薛之谦-像风一样.mp3");
		this.listSong.add(s1);
		this.listSong.add(s2);
		this.listSong.add(s3);
		this.listSong.add(s4);
		this.listSong.add(s5);
	}
	
	
	//主持人按顺序播放歌曲
	public void play(){
		for(int i=0;i<this.listSong.size();i++){
			Song s=this.listSong.get(i);
			s.PlaySong();
		}
		
	}
}
