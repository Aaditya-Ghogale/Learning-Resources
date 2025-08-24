class RunnableJava {
    public static void main(String[] args) {

    A obj=new A();
    B obj1=new B();

    Thread obj3 = new Thread(obj);
    Thread obj4 = new Thread(obj1);

  
    obj3.setPriority(10);
    // obj2.setPriority(Thread.MAX_PRIORITY);
    obj3.start();
    obj4.start();
    

    try {
        obj3.join();
        obj4.join();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    System.out.println("Main thread work complete");
    }       
}

class A implements Runnable{
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

class B implements Runnable{
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