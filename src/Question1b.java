//1) Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in
// the created threads.
class Runner implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+" is doing work");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}

public class Question1b {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        Thread thread3 = new Thread(new Runner());
        thread1.start();

        //System.out.println("No of thread before join is " + Thread.activeCount());
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // will start after thread2 dies
        thread2.start();
        try {


            thread2.join();
            //System.out.println(Thread.currentThread());
            //ystem.out.println("No of threads after join is " + Thread.activeCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //started thread 3 to join
        thread3.start();

    }
}
