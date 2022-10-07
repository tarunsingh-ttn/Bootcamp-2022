import java.util.concurrent.*;

// WAP to show usage of Callable and demonstrate how it is different from Runnable

public class Question4 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        Future<Integer> future=executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for(int i=0;i<20;i++){
                    sum=sum+i;
                }
                return sum;
            }
        });
        executor.shutdown();
        try {
            System.out.println("Sum : "+ future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
