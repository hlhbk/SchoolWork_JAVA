package threadTest;

public class Thread02 extends Thread{
	static int size = 101;
	static int i = 1;
	static int j = 1;
	static int k = 1;
	static int h = 1;
	static long m = 0;

	public Thread02() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		com();
		//System.out.println("m=" + Thread02.m);
	}

	synchronized static void com() {
		for (i = 1; i < size; i++) {
			for (j = 1; j < size; j++) {
				for (k = 1; k < size; k++) {
					for (h = 1; h < size; h++) {
						m += h * k * j * i;
					}
				}
			}
		}
	}

}
