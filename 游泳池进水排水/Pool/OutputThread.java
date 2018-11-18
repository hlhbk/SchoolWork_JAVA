package Pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 鏀炬按绾跨▼ Created by captain on 2017/7/27.
 */
public class OutputThread implements Callable<Object> {

	private static BlockingQueue<String> queue;
	private int sudu;

	public OutputThread(BlockingQueue<String> queue, int sudu) {
		this.queue = queue;
		this.sudu = sudu;
	}

	@Override
	public Object call() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (queue.size() == 10000) {
					break;
				}
				for (int cnt = 0; cnt < sudu; cnt++) {
					queue.poll(10, TimeUnit.MILLISECONDS);
					// queue.poll();
				}
			}

			System.out.println(Thread.currentThread().getName() + "----" + "排水" + sudu + "立方，当前水量为" + queue.size());
			TimeUnit.MILLISECONDS.sleep(1);
		}
		return "排水success";
	}
}
