package Pool;

import Pool.ThreadUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * 瀹氭湡鏀炬按绫�
 * Created by captain on 2017/7/27.
 */
public class WaterTimeTask extends TimerTask {

    @Override
    public void run() {
    	  long time01=System.currentTimeMillis();
      
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);
        InputThread thread1 = new InputThread(queue,5);
      // InputThread thread2 = new InputThread(queue,3);
        //InputThread thread3 = new InputThread(queue,1);
       OutputThread thread4 = new OutputThread(queue,3);
       // OutputThread thread5 = new OutputThread(queue,2);
        List<Callable<Object>> threadList = new ArrayList<>();
        threadList.add(thread1);
      //threadList.add(thread2);
       // threadList.add(thread3);
        threadList.add(thread4);
      //  threadList.add(thread5);
        List<Object> returnValue = null;
        try {
            returnValue = ThreadUtil.runCheckCallable(threadList,true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("泳池已注满");
        for(int i=0;i<returnValue.size();i++){
        	System.out.println(returnValue.get(i));
        }
        
        //System.out.println(returnValue.get(1)); 
         long time02=System.currentTimeMillis();
        System.out.println("加水一次的时间为"+(time02-time01)+"毫秒");
    }
}
