package 唱歌0;

public class Song {
	private String Sname;//歌曲名字
	private String Singer;//演唱歌手
	private double lastTime;//播放时长
	private String route;//歌曲存放路径
	
	
	//各个属性的get() and set()
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
	
	//构造方法中给出歌曲姓名，歌手等信息
	public Song(String sname,String singer) {
		// TODO Auto-generated constructor stub
		this.Sname=sname;this.Singer=singer;
	}
	
	//播放歌曲
	public void PlaySong(){
		System.out.println(this);
	}
	
	//便于输出歌曲信息
	public String toString(){
		return this.Sname+"--"+this.Singer+"--"+this.lastTime;
	}
	
	
}
