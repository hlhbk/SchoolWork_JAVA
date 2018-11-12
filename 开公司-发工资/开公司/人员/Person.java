package 人员;

public abstract class Person {
	String name;//姓名
	double salary;//基础工资
	Date birth;//生日
	String title;//职务
	double gift=0;//礼物
	double reward=0;//生日
	//初始化基本信息
	public Person(String name,double salary,Date birth) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.salary=salary;
		this.birth=birth;
	}
	
	//当月工资计算
	public abstract double pay(int m);
	
	//计算年薪
	public double yearsalary(){
		double all=0;
		for(int i=1;i<13;i++){
			all=all+pay(i);
		}
		return all;
	}
	
	//toString 重写
	public String toString(){
		return name+"\t\t"+birth+"\t"+title+"\t\t"+salary;
	}

}
