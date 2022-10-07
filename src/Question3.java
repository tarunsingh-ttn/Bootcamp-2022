class SyncWorker implements Runnable {
    @Override
    public void run() {
        printInfo();
    }



    private int count=0;
    synchronized void printInfo() {

        for (int i = 0; i < 10; i++) {

            System.out.print(count++ +" ");

        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SyncWorker());
        Thread thread2 = new Thread(new SyncWorker());
        thread1.start();
        thread2.start();

    }
}
