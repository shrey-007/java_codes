package multithreading.daemon;

class MyTHread1 extends Thread{

    public void run() {
        Daemon daemon=new Daemon();
        daemon.setDaemon(true);
        daemon.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class Daemon extends Thread{
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("shrey "+i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyTHread1 myTHread1=new MyTHread1();
        myTHread1.start();
    }
}
