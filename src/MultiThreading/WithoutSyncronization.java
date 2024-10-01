package MultiThreading;



class TestThread {
    public synchronized static void display(int num) {                 //allows things to go one at a time in case data changes
 //       synchronized (this) {                                        //synchronized without the static does less synchronization
            for (int i = 0; i < 5; i++) {                              //synchronized makes all the threads wait thair turn
                System.out.println(num * i);
                try {
                    Thread.sleep(200);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
  //  }
}

class MyThread1 extends Thread {

    TestThread t;

    MyThread1(TestThread t) {
        this.t = t;
    }

    public void run() {
        t.display(5);
    }


    }

class MyThread2 extends Thread{
    TestThread t;

    MyThread2(TestThread t) {
        this.t = t;
    }

    public void run() {
        t.display(8);
    }

}


public class WithoutSyncronization {
    public static void main(String[] args) {
       TestThread t = new TestThread();
       MyThread1 t1 = new MyThread1(t);
       MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}