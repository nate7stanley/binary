package MultiThreading;

class MyThread extends Thread {

    public MyThread(String name) {

    }

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("thread is tired");
        }
    }

}       //wait, notify, join, daemon
        //create random number guessing game


public class ThreadExample {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            MyThread thread = new MyThread("thread");
            thread.setPriority(Thread.NORM_PRIORITY);
            thread.start();
        }
        for(int j=0; j<5; j++) {
            MyThread thread1 = new MyThread("bigthread");
            thread1.setPriority(Thread.MAX_PRIORITY);
            thread1.start();
        }
    }
}