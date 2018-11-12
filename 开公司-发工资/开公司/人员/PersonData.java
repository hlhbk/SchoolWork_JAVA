package 人员;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonData {
	Scanner sc;
	List<Person> person;// 公司所有人员集合
	List<Staff> staff;// 公司所有普通员工集合
	List<Manager> manager;// 公司所有经理集合
	List<Dominant> dominant;// 公司所有股东集合

	// 初始化公司各类成员集合
	public PersonData() {
		// TODO Auto-generated constructor stub
		person = new ArrayList();
		staff = new ArrayList();
		manager = new ArrayList();
		dominant = new ArrayList();
		sc = new Scanner(System.in);
	}

	// 初始化员工信息
	public void addInformation() {

		System.out.println("请输入现有普通员工人数：");
	}

	// 添加Person
	public void addPerson() {

		System.out.println("请输入添加的成员类别(1.普通员工	2.经理 	3.股东):");
		int distinct = sc.nextInt();
		System.out.println("请输入员工姓名:");
		String name = sc.next();
		System.out.println("请输入员工的生日(年，月，日):");
		Date birth = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Person p = null;
		switch (distinct) {
		case 1:
			p = new Staff(name, birth);
			p.title = "普通员工";
			staff.add((Staff) p);
			break;
		case 2:
			p = new Manager(name, birth);
			p.title = "经理";
			manager.add((Manager) p);
			break;
		case 3:
			p = new Dominant(name, birth);
			p.title = "股东";
			System.out.println("请输入股东占比");
			((Dominant) p).setStock(sc.nextDouble());
			dominant.add((Dominant) p);
			break;
		}
		person.add(p);
		System.out.println("加入公司成员成功");
	}

	// 按进公司先后输出公司人员信息(编号，姓名，生日，职务)；
	public void showInformation() {
		System.out.println("公司成员信息如下:");
		System.out.println("编号\t" + "姓名\t\t" + "生日\t\t" + "职务\t\t" + "基本工资");
		for (int i = 0; i < person.size(); i++) {
			System.out.println((i + 1) + "\t" + person.get(i));
		}
		System.out.println("公司总员工数：" + person.size());
	}

	// 按职务顺序输出公司某个月的薪水信息》姓名 职务 基础工资 礼物 奖金 实际薪水
	public void showdetail(int month) {
		int yearpro = 0;
		System.out.println(month + "月份员工薪水一览");
		System.out.println("请输入当月销售额：");
		int profit = sc.nextInt();
		System.out.println("姓名\t" + "职务\t" + "基础工资\t" + "礼物\t" + "奖金\t" + "实际薪水\t");
		for (int i = 0; i < staff.size(); i++) {
			Staff s = staff.get(i);
			System.out.println(s.name + "\t" + s.title + "\t" + s.salary + "\t" + s.gift + "\t" + s.reward + "\t"
					+ s.pay(month) + "\t");
		}
		for (int i = 0; i < manager.size(); i++) {
			Manager s = manager.get(i);
			s.setMonthProfit(profit);
			s.setReward();
			System.out.println(s.name + "\t" + s.title + "\t" + s.salary + "\t" + s.gift + "\t" + s.reward + "\t"
					+ s.pay(month) + "\t");
		}
		if (month == 12) {
			System.out.println("请输入年利润：");
			yearpro = sc.nextInt();
		}
		for (int i = 0; i < dominant.size(); i++) {
			Dominant s = dominant.get(i);
			s.setYearProfit(yearpro);
			System.out.println(s.name + "\t" + s.title + "\t" + s.salary + "\t" + s.gift + "\t" + s.reward + "\t"
					+ s.pay(month) + "\t");
		}
	}

	// 查询某个公司成员某个月的工资（假设公司人员姓名唯一）
	public void selectSalary() {
		System.out.println("请输入员工姓名：");
		String name = sc.next();
		for (int i = 0; i < person.size(); i++) {
			Person p = person.get(i);
			if (p.name == name) {
				System.out.println("请输入查询月份：");
				int m = sc.nextInt();
				switch (p.title) {
				/*
				 * case "普通员工": System.out.println("该成员当月工资为："+p.pay(m));
				 * System.out.println("由(薪水"+p.salary+",礼物"+p.gift+",奖金"+p.
				 * reward+")组成"); break;
				 */
				case "经理":
					System.out.println("请输入当月销售额：");
					int profit = sc.nextInt();
					((Manager) p).setMonthProfit(profit);
					((Manager) p).setReward();
					break;
				/*
				 * System.out.println("该成员当月工资为："+p.pay(m));
				 * System.out.println("由(薪水"+p.salary+",礼物"+p.gift+",奖金"+p.
				 * reward+")组成");
				 */
				case "股东":
					if (m == 12) {
						System.out.println("请输入年利润：");
						double yearpro = sc.nextDouble();
						((Dominant) p).setYearProfit(yearpro);
					}
					break;
				}
				System.out.println("该成员当月工资为：" + p.pay(m));
				System.out.println("由(薪水" + p.salary + ",礼物" + p.gift + ",奖金" + p.reward + ")组成");
				return;	
				}
			
		}
		System.out.println("没有该员工");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonData persondata = new PersonData();
		for (int i = 0; i < 5; i++) {
			persondata.addPerson();
		}

		persondata.showInformation();
		//persondata.showdetail(12);
		persondata.selectSalary();
	}

}
