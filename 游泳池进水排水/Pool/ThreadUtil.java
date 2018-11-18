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
	        //�Բ������м��
	        if (CheckNull(list)) {
	            return new ArrayList<>();
	        }

	        //��ʼ���̣߳���һ���̳߳�
	        exec = Executors.newCachedThreadPool();
	        //����̲߳�����Future�߳�
	        List<Future<Object>> futureList = exec.invokeAll(list);

	        if (!isBlock){
	            return new ArrayList<>();
	        }
	        //��鲢��ȡ�̷߳���ֵ
	        return getAllCallableReturn(futureList);
	    }

	    private static boolean CheckNull(List<Callable<Object>> list) {
	        //���list�Ƿ�Ϊ��
	        if (list==null||list.size()<1){
	            return true;
	        }
	        //���list�ж����Ƿ�Ϊ��
	        for (Callable callable :list){
	            if (callable==null){
	                return true;
	            }
	        }
	        return false;
	    }

	    private static List<Object> getAllCallableReturn(List<Future<Object>> futureList) throws ExecutionException, InterruptedException {
	        List<Object> returnValue = new ArrayList<>(futureList.size());//Ϊ��ʹ���ܱȽϺã���˽�ArrayList�ĳ���Ϊ�߳�����
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
	        //���list�Ƿ�Ϊ��
	        if (RunnableList==null||RunnableList.size()<1){
	            return;
	        }
	        //��ʼ���̳߳أ�ʹ��һ���̳߳ؿ���һ���߳�
	        ExecutorService exec = Executors.newCachedThreadPool();
	        //����̲߳�����Future�߳�
	        List<Future> futureList = new ArrayList<>(RunnableList.size());
	        //ѭ����������ÿ���߳�������ӽ�ȥ
	        for (Runnable runnable:RunnableList){
	            if (runnable!=null){
	                Future future = exec.submit(runnable);
	                futureList.add(exec.submit(runnable));
	            }
	        }
	        //�̲߳�����
	        if (!isBlock){
	            return;
	        }
	        while(true){
	            Iterator<Future> iterator = futureList.iterator();
	            while(iterator.hasNext()) {
	                Future<Object> future = iterator.next();
	                if (future.isDone()) {               //�߳�ִ�н���
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
