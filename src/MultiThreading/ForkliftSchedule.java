package MultiThreading;

class CurrentDriver {
    public synchronized void display(String name) {
       try {
           System.out.println("oh no, there is only one forklift, i hope they dont all try to drive it at once");
           Thread.sleep(1000);
           System.out.println("Current Driver: " + name);
           Thread.sleep(1000);
           System.out.println("ok he's done");
           Thread.sleep(1000);
           System.out.println("wow, good thing they waited, that could have been bad");
       } catch (InterruptedException e) {
           throw new RuntimeException();
       }
    }
}

class Driver extends Thread {
    String name;
    CurrentDriver d;

    public Driver(CurrentDriver d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.display(name);

    }
}

public class ForkliftSchedule {
    public static void main(String[] args) {
        CurrentDriver driver = new CurrentDriver();
        Driver d1 = new Driver(driver, "ForkliftMan");
        Driver d2 = new Driver(driver, "ForkliftGuy");
        Driver d3 = new Driver(driver, "ForkliftDude");
        d3.setPriority(Thread.MAX_PRIORITY);
        d1.start();
        d2.start();
        d3.start();
    }
}
