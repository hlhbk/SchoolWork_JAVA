package ����0;

import java.util.ArrayList;
import java.util.List;

public class Host {
	static List<Song> listSong;
		// TODO Auto-generated constructor stub
	public Host(){
		this.listSong=new ArrayList();
		Song s1=new Song("���ټ�","��ѧ��");s1.setLastTime(2.80);s1.setRoute("songs/��ѧ��-���ټ�.mp3");
		Song s2=new Song("�Ӹ���","��һǹ");s2.setLastTime(3.80);s1.setRoute("songs/�Ӹ��ǣ���һǹ.mp3");
		Song s3=new Song("��̫��","�����");s3.setLastTime(4.20);s1.setRoute("songs/�����-��̫��.mp3");
		Song s4=new Song("ĩ�೵","��˼��");s4.setLastTime(3.50);s1.setRoute("songs/��˼��-ĩ�೵.mp3");
		Song s5=new Song("���һ��","Ѧ֮ǫ");s5.setLastTime(4.05);s1.setRoute("songs/Ѧ֮ǫ-���һ��.mp3");
		this.listSong.add(s1);
		this.listSong.add(s2);
		this.listSong.add(s3);
		this.listSong.add(s4);
		this.listSong.add(s5);
	}
	
	
	//�����˰�˳�򲥷Ÿ���
	public void play(){
		for(int i=0;i<this.listSong.size();i++){
			Song s=this.listSong.get(i);
			s.PlaySong();
		}
		
	}
}
