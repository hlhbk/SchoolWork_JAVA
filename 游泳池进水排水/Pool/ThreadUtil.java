package Pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;


	public class ThreadUtil {

	    private static ExecutorService exec;
	    public static List<Object> runCheckCallable(List<Callable<Object>> list, boolean isBlock) throws InterruptedException, ExecutionException {
	        //对参数进行检测
	        if (CheckNull(list)) {
	            return new ArrayList<>();
	        }

	        //初始化线程，打开一个线程池
	        exec = Executors.newCachedThreadPool();
	        //添加线程并返回Future线程
	        List<Future<Object>> futureList = exec.invokeAll(list);

	        if (!isBlock){
	            return new ArrayList<>();
	        }
	        //检查并获取线程返回值
	        return getAllCallableReturn(futureList);
	    }

	    private static boolean CheckNull(List<Callable<Object>> list) {
	        //检测list是否为空
	        if (list==null||list.size()<1){
	            return true;
	        }
	        //检测list中对象是否为空
	        for (Callable callable :list){
	            if (callable==null){
	                return true;
	            }
	        }
	        return false;
	    }

	    private static List<Object> getAllCallableReturn(List<Future<Object>> futureList) throws ExecutionException, InterruptedException {
	        List<Object> returnValue = new ArrayList<>(futureList.size());//为了使性能比较好，因此将ArrayList的长度为线程数量
	        while(true){
	            Iterator<Future<Object>> iterator = futureList.iterator();
	            while(iterator.hasNext()){
	                Future<Object> future = iterator.next();
	                if (future.isDone()){
	                    Object o = future.get();
	                    returnValue.add(o);
	                    iterator.remove();
	                }
	            }
	            if (futureList.size()==0){
	                break;
	            }
	            TimeUnit.MILLISECONDS.sleep(10*1000);
	        }
	        return returnValue;
	    }

	  public static void runCheckRunnable(List<Runnable> RunnableList,boolean isBlock) throws InterruptedException {
	        //检测list是否为空
	        if (RunnableList==null||RunnableList.size()<1){
	            return;
	        }
	        //初始化线程池，使用一个线程池开启一个线程
	        ExecutorService exec = Executors.newCachedThreadPool();
	        //添加线程并返回Future线程
	        List<Future> futureList = new ArrayList<>(RunnableList.size());
	        //循环遍历，将每个线程依次添加进去
	        for (Runnable runnable:RunnableList){
	            if (runnable!=null){
	                Future future = exec.submit(runnable);
	                futureList.add(exec.submit(runnable));
	            }
	        }
	        //线程不阻塞
	        if (!isBlock){
	            return;
	        }
	        while(true){
	            Iterator<Future> iterator = futureList.iterator();
	            while(iterator.hasNext()) {
	                Future<Object> future = iterator.next();
	                if (future.isDone()) {               //线程执行结束
	                    iterator.remove();
	                }
	            }
	            if (futureList.size()==0){
	                break;
	            }
	            TimeUnit.MILLISECONDS.sleep(10);
	        }
	    }
	    public static void runCheckRunnable(Runnable runnable){

	        if (exec==null){
	            exec = Executors.newCachedThreadPool();
	        }
	   }

}
