package 人员;

public class Manager extends Person{
	double monthProfit;//月销售额
	
	public void setMonthProfit(double monthProfit) {
		this.monthProfit = monthProfit;
	}
	//初始化经理信息，基础工资为5000
	public Manager(String name,Date birth) {
		// TODO Auto-generated constructor stub
		super(name,5000,birth);
		gift=1000;
		
	}
	
	public void setReward(){
		this.reward=0.01*this.monthProfit;
	}
	//经理当月实际薪水
	@Override
	public double pay(int m) {
		// TODO Auto-generated method stub
		if(m==this.birth.month){
			return salary+reward+gift;
		}else{
			return salary+reward;
		}
	}

}
