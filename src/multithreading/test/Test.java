//program to show ki input lekar thread se kese kaam krvaaye

package multithreading.test;


import java.util.Scanner;

class MinThread extends Thread{
    int num1;
    int num2;
    MinThread(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void run(){
        System.out.println("min is "+Math.min(num1,num2)+" "+Thread.currentThread().getName());
    }
}

class MaxThread extends Thread{
    int num1;
    int num2;
    MaxThread(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void run(){
        System.out.println("max is "+Math.max(num1,num2)+" "+Thread.currentThread().getName());
    }
    }

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int num1=sc.nextInt();
        System.out.println("Enter number2");
        int num2=sc.nextInt();
        MinThread minThread=new MinThread(num1,num2);
        minThread.start();
        MaxThread maxThread=new MaxThread(num1,num2);
        maxThread.start();;
    }
}
