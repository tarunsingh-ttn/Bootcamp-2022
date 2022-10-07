import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// 2) Use a singleThreadExecutor, newCachedThreadPool()
// and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.
class WorkerThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " running");
        task();
    }
    void task(){
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class Question2 {

    public static void main(String[] args) {
        ExecutorService threadExecutor= Executors.newFixedThreadPool(5);
        Runnable worker =new WorkerThread();
        threadExecutor.execute(worker);
        threadExecutor.shutdown();
        threadExecutor=Executors.newCachedThreadPool();


    }

}
