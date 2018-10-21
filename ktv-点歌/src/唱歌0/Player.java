package 唱歌0;

import java.util.Scanner;

public class Player {
	Host host;

	public Player() {
		// TODO Auto-generated constructor stub
		host=new Host();
	}
	public void addSong(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("请开始点歌——————————");
		System.out.println("请输入歌曲名称：");
		String sname=scanner.next();
		System.out.println("请输入歌手：");
		String singer=scanner.next();
		Song song=new Song(sname,singer);
		for(int i=0;i<host.listSong.size();i++){
			Song s=host.listSong.get(i);
			if(s.getSname()==song.getSname() && s.getSinger()==song.getSinger()){
				System.out.println("歌曲已存在播放列表中");
				System.out.println("歌曲信息为：：："+host.listSong.get(i));
				break;
			}else{
				System.out.println("歌曲不在播放列表中");
				System.out.println("请输入歌曲时长：");
				song.setLastTime(scanner.nextDouble());
				System.out.println("请输入歌曲本地路径");
				song.setRoute(scanner.next());
				this.host.listSong.add(song);
				System.out.println("点歌成功！");break;
			}
			
		}
		
		
	}

}
