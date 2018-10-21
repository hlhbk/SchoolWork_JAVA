package 唱歌0;

public class Drive {//程序控制类
	
	public Host host;//主持人
	public Player player;//点歌的
	public Drive() {
		// TODO Auto-generated constructor stub
		host=new Host();
		player=new Player();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive dd=new Drive();
		dd.player.addSong();
		dd.host.play();
	}

}
