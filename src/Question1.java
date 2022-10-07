//1) Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in
// the created threads.
class Worker extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() + " is doing work");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}

public class Question1 {
    public static void main(String[] args) {
            Worker w=new Worker();
            Worker w2=new Worker();

            w.start();

        try {
            w.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            w2.start();
    }
}
