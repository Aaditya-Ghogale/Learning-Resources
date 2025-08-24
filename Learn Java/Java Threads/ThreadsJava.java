import java.util.*;

class ThreadsJava {
    public static void main(String[] args) {
    A obj=new A();
    B obj2=new B();
    
    obj.setPriority(10);
    // obj2.setPriority(Thread.MAX_PRIORITY);
    obj.start();
    obj2.start();
    }       
}

class A extends Thread{
    public void run(){
        for (int i=0; i<20; i++){
            System.out.println("Hi from A: ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i=0; i<30; i++){
            System.out.println("Hello from B: ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}