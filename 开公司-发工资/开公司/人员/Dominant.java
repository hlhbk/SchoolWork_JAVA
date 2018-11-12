package 人员;

public class Dominant extends Person{
	double yearProfit;
	double stock;
	
	//年利润查询和录入
	public double getYearProfit() {
		return yearProfit;
	}
	public void setYearProfit(double yearProfit) {
		this.yearProfit = yearProfit;
	}
	
	//股东股票占比查询和录入
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	
	//初始化股东的基本信息，基础工资为0
	public Dominant(String name,Date birth) {
		// TODO Auto-generated constructor stub
		super(name,0,birth);
	}
	
	//股东薪水
	@Override
	public double pay(int m) {
		// TODO Auto-generated method stub
		if(m==12){
			return 0.1*yearProfit*stock;
		}
		return 0;
	}

}
