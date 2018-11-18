package Pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 娉ㄦ按绾跨▼
 * Created by captain on 2017/7/27.
 */
public class InputThread implements Callable<Object>{

    private static BlockingQueue<String> queue;
    private int sudu;
    public InputThread(BlockingQueue<String> queue,int sudu){
        this.queue = queue;
        this.sudu=sudu;
    }

    @Override
    public Object call() throws InterruptedException {
        while(true){
            boolean flag = true;
            for(int cnt=0;cnt<sudu;cnt++){
                flag = queue.offer("一立方米");
                if(!flag){
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName()+"----"+"进水"+sudu+"立方米，泳池当前水量为"+queue.size());
            if(!flag){
                break;
            }
            TimeUnit.MILLISECONDS.sleep(1);
        }
        return "进水success";
    }
}
