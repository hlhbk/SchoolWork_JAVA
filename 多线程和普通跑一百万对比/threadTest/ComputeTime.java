package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComputeTime {

	public ComputeTime() {
		// TODO Auto-generated constructor stub
	}

	void normalCompute() {// ��ͨ����
		long timestart = System.currentTimeMillis();
		int size=101;
		long m = 0;
		for(int i=1;i<size;i++){
			for(int j=1;j<size;j++){
				for(int k=1;k<size;k++){
					for(int h=1;h<size;h++){
						m+=h*k*j*i;
					}
				}
			}
		}
		long timeend = System.currentTimeMillis();
		System.out.println("m=" + m);
		System.out.println("��ͨ������������Ҫ��ʱ��Ϊ" + (timeend - timestart) + "����");
	}

	/*void threadCompute() {// �����߳�
		
		long timestart = System.currentTimeMillis();
		Thread01 a = new Thread01();
		Thread01 b = new Thread01();
		ExecutorService es=Executors.newSingleThreadExecutor();
		es.execute(a);
		es.execute(b);
		System.out.println("m=" + Thread01.m);
		es.shutdown();
		long timeend = System.currentTimeMillis();
		System.out.println("2���̼߳����������Ҫ��ʱ��Ϊ" + (timeend - timestart) + "����");

	}*/
	void threadCompute2() {// �����߳�
		long timestart = System.nanoTime();
		Thread02 a = new Thread02();
		Thread02 b = new Thread02();
		a.start();
		b.start();
		long timeend = System.nanoTime();
		System.out.println("2���̼߳����������Ҫ��ʱ��Ϊ" + (timeend - timestart) + "����");

	}
	void threadCompute4() {// �ĸ��߳�
		long timestart = System.nanoTime();
		Thread02 a = new Thread02();
		Thread02 b = new Thread02();
		Thread02 c = new Thread02();
		Thread02 d = new Thread02();
		a.start();
		b.start();
		c.start();
		d.start();
		long timeend = System.nanoTime();
		System.out.println("4���̼߳����������Ҫ��ʱ��Ϊ" + (timeend - timestart) + "����");

	}
	void threadCompute6() {// �����߳�
		long timestart = System.nanoTime();
		Thread02 a = new Thread02();
		Thread02 b = new Thread02();
		Thread02 c = new Thread02();
		Thread02 d = new Thread02();
		Thread02 e = new Thread02();
		Thread02 f = new Thread02();
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		f.start();
		long timeend = System.nanoTime();
		System.out.println("6���̼߳����������Ҫ��ʱ��Ϊ" + (timeend - timestart) + "����");

	}
	void threadCompute8() {// �˸��߳�
		long timestart = System.nanoTime();
		Thread02 a = new Thread02();
		Thread02 b = new Thread02();
		Thread02 c = new Thread02();
		Thread02 d = new Thread02();
		Thread02 e = new Thread02();
		Thread02 f = new Thread02();
		Thread02 g = new Thread02();
		Thread02 h = new Thread02();
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		f.start();
		g.start();
		h.start();
		long timeend = System.nanoTime();
		System.out.println("8���̼߳����������Ҫ��ʱ��Ϊ" + (timeend - timestart) + "����");

	}




}
