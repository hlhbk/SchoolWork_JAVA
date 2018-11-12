package ÈËÔ±;

public class Date {
	int year;
	int month;
	int day;

	public Date(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		   this.year=a;
		   this.month=b;
		   this.day=c;
	}
	public String toString(){
		return year+"/"+month+"/"+day;
	}
}
