package ����0;

public class Drive {//���������
	
	public Host host;//������
	public Player player;//����
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
