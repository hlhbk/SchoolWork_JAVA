package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComputeTime {

	public ComputeTime() {
		// TODO Auto-generated constructor stub
	}

	void normalCompute() {// 普通方法
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
		System.out.println("普通方法计算所需要的时间为" + (timeend - timestart) + "毫秒");
	}

	/*void threadCompute() {// 两个线程
		
		long timestart = System.currentTimeMillis();
		Thread01 a = new Thread01();
		Thread01 b = new Thread01();
		ExecutorService es=Executors.newSingleThreadExecutor();
		es.execute(a);
		es.execute(b);
		System.out.println("m=" + Thread01.m);
		es.shutdown();
		long timeend = System.currentTimeMillis();
		System.out.println("2个线程计算计算所需要的时间为" + (timeend - timestart) + "毫秒");

	}*/
	void threadCompute2() {// 两个线程
		long timestart = System.nanoTime();
		Thread02 a = new Thread02();
		Thread02 b = new Thread02();
		a.start();
		b.start();
		long timeend = System.nanoTime();
		System.out.println("2个线程计算计算所需要的时间为" + (timeend - timestart) + "纳秒");

	}
	void threadCompute4() {// 四个线程
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
		System.out.println("4个线程计算计算所需要的时间为" + (timeend - timestart) + "纳秒");

	}
	void threadCompute6() {// 六个线程
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
		System.out.println("6个线程计算计算所需要的时间为" + (timeend - timestart) + "纳秒");

	}
	void threadCompute8() {// 八个线程
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
		System.out.println("8个线程计算计算所需要的时间为" + (timeend - timestart) + "纳秒");

	}




}
