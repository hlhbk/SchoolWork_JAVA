package ��Ա;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonData {
	Scanner sc;
	List<Person> person;// ��˾������Ա����
	List<Staff> staff;// ��˾������ͨԱ������
	List<Manager> manager;// ��˾���о�����
	List<Dominant> dominant;// ��˾���йɶ�����

	// ��ʼ����˾�����Ա����
	public PersonData() {
		// TODO Auto-generated constructor stub
		person = new ArrayList();
		staff = new ArrayList();
		manager = new ArrayList();
		dominant = new ArrayList();
		sc = new Scanner(System.in);
	}

	// ��ʼ��Ա����Ϣ
	public void addInformation() {

		System.out.println("������������ͨԱ��������");
	}

	// ���Person
	public void addPerson() {

		System.out.println("��������ӵĳ�Ա���(1.��ͨԱ��	2.���� 	3.�ɶ�):");
		int distinct = sc.nextInt();
		System.out.println("������Ա������:");
		String name = sc.next();
		System.out.println("������Ա��������(�꣬�£���):");
		Date birth = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Person p = null;
		switch (distinct) {
		case 1:
			p = new Staff(name, birth);
			p.title = "��ͨԱ��";
			staff.add((Staff) p);
			break;
		case 2:
			p = new Manager(name, birth);
			p.title = "����";
			manager.add((Manager) p);
			break;
		case 3:
			p = new Dominant(name, birth);
			p.title = "�ɶ�";
			System.out.println("������ɶ�ռ��");
			((Dominant) p).setStock(sc.nextDouble());
			dominant.add((Dominant) p);
			break;
		}
		person.add(p);
		System.out.println("���빫˾��Ա�ɹ�");
	}

	// ������˾�Ⱥ������˾��Ա��Ϣ(��ţ����������գ�ְ��)��
	public void showInformation() {
		System.out.println("��˾��Ա��Ϣ����:");
		System.out.println("���\t" + "����\t\t" + "����\t\t" + "ְ��\t\t" + "��������");
		for (int i = 0; i < person.size(); i++) {
			System.out.println((i + 1) + "\t" + person.get(i));
		}
		System.out.println("��˾��Ա������" + person.size());
	}

	// ��ְ��˳�������˾ĳ���µ�нˮ��Ϣ������ ְ�� �������� ���� ���� ʵ��нˮ
	public void showdetail(int month) {
		int yearpro = 0;
		System.out.println(month + "�·�Ա��нˮһ��");
		System.out.println("�����뵱�����۶");
		int profit = sc.nextInt();
		System.out.println("����\t" + "ְ��\t" + "��������\t" + "����\t" + "����\t" + "ʵ��нˮ\t");
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
			System.out.println("������������");
			yearpro = sc.nextInt();
		}
		for (int i = 0; i < dominant.size(); i++) {
			Dominant s = dominant.get(i);
			s.setYearProfit(yearpro);
			System.out.println(s.name + "\t" + s.title + "\t" + s.salary + "\t" + s.gift + "\t" + s.reward + "\t"
					+ s.pay(month) + "\t");
		}
	}

	// ��ѯĳ����˾��Աĳ���µĹ��ʣ����蹫˾��Ա����Ψһ��
	public void selectSalary() {
		System.out.println("������Ա��������");
		String name = sc.next();
		for (int i = 0; i < person.size(); i++) {
			Person p = person.get(i);
			if (p.name == name) {
				System.out.println("�������ѯ�·ݣ�");
				int m = sc.nextInt();
				switch (p.title) {
				/*
				 * case "��ͨԱ��": System.out.println("�ó�Ա���¹���Ϊ��"+p.pay(m));
				 * System.out.println("��(нˮ"+p.salary+",����"+p.gift+",����"+p.
				 * reward+")���"); break;
				 */
				case "����":
					System.out.println("�����뵱�����۶");
					int profit = sc.nextInt();
					((Manager) p).setMonthProfit(profit);
					((Manager) p).setReward();
					break;
				/*
				 * System.out.println("�ó�Ա���¹���Ϊ��"+p.pay(m));
				 * System.out.println("��(нˮ"+p.salary+",����"+p.gift+",����"+p.
				 * reward+")���");
				 */
				case "�ɶ�":
					if (m == 12) {
						System.out.println("������������");
						double yearpro = sc.nextDouble();
						((Dominant) p).setYearProfit(yearpro);
					}
					break;
				}
				System.out.println("�ó�Ա���¹���Ϊ��" + p.pay(m));
				System.out.println("��(нˮ" + p.salary + ",����" + p.gift + ",����" + p.reward + ")���");
				return;	
				}
			
		}
		System.out.println("û�и�Ա��");

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
