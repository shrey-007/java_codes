package multithreading.sleep;

class Thread1 extends Thread {
    @Override
    public void run() {
       try{
           for (int i = 0; i < 100; i++) {
               System.out.println("hello shrey");
               Thread.sleep(5000);
           }
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
    }
}
