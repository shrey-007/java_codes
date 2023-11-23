/*do threads hai MyThread and waitingThread, dono ek saath chalege jaise hi waitingthread 500 pr pahuchegi toh
voh ruk jaaegi krna kaam krna hai wait kregi ki kab mythread apni poori iteration complete kre fir vo apni remaining
500 iterations complete karegi.
waitingThread ko mythread ka reference chaiye wait krvaane ke liye toh vo as a variable bana diya us class mai
and apan us vbossThread ki value constructor mai paas kr denge*/



package multithreading.join;

class Mythread extends Thread{

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello World" +i);
        }
    }
}

class WaitingThread extends Thread{
    Thread bossThread;

    WaitingThread(Thread bossThread){
        this.bossThread=bossThread;
    }

    public void run() {
        try{
            for (int i = 0; i < 1000; i++) {
                if(i==500){bossThread.join();}
                System.out.println("i am waiting"+i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Mythread mythread =new Mythread();
        WaitingThread waitingThread=new WaitingThread(mythread);


        mythread.start();
        waitingThread.start();
    }
}
