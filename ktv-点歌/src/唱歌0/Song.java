package ����0;

public class Song {
	private String Sname;//��������
	private String Singer;//�ݳ�����
	private double lastTime;//����ʱ��
	private String route;//�������·��
	
	
	//�������Ե�get() and set()
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public double getLastTime() {
		return lastTime;
	}
	public void setLastTime(double lastTime) {
		this.lastTime = lastTime;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	//���췽���и����������������ֵ���Ϣ
	public Song(String sname,String singer) {
		// TODO Auto-generated constructor stub
		this.Sname=sname;this.Singer=singer;
	}
	
	//���Ÿ���
	public void PlaySong(){
		System.out.println(this);
	}
	
	//�������������Ϣ
	public String toString(){
		return this.Sname+"--"+this.Singer+"--"+this.lastTime;
	}
	
	
}
