package ����0;

import java.util.Scanner;

public class Player {
	Host host;

	public Player() {
		// TODO Auto-generated constructor stub
		host=new Host();
	}
	public void addSong(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("�뿪ʼ��衪������������������");
		System.out.println("������������ƣ�");
		String sname=scanner.next();
		System.out.println("��������֣�");
		String singer=scanner.next();
		Song song=new Song(sname,singer);
		for(int i=0;i<host.listSong.size();i++){
			Song s=host.listSong.get(i);
			if(s.getSname()==song.getSname() && s.getSinger()==song.getSinger()){
				System.out.println("�����Ѵ��ڲ����б���");
				System.out.println("������ϢΪ������"+host.listSong.get(i));
				break;
			}else{
				System.out.println("�������ڲ����б���");
				System.out.println("���������ʱ����");
				song.setLastTime(scanner.nextDouble());
				System.out.println("�������������·��");
				song.setRoute(scanner.next());
				this.host.listSong.add(song);
				System.out.println("���ɹ���");break;
			}
			
		}
		
		
	}

}
