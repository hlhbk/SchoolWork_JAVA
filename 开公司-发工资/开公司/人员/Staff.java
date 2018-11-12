package 人员;

public class Staff extends Person{
	//初始化员工信息，员工的基础工资定为3000
	public Staff(String name,Date birth) {
		// TODO Auto-generated constructor stub
		super(name, 3000, birth);
		gift=500;
	}
	
	//员工当月实际工资
	@Override
	public double pay(int m) {
		// TODO Auto-generated method stub
		//发第m个月的工资，若当月是员工生日则加一千块作为礼物
		if(m==this.birth.month){
			return salary+gift;
		}else{
			return salary;
		}	
	}
}
