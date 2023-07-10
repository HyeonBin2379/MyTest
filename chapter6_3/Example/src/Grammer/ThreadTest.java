package Grammer;
class T_ThreadTest extends Thread {
    public void run()
    {
        System.out.println("Run");
    }
}

public class ThreadTest {
    public static void main(String[] args)
    {
        Thread t1 = new T_ThreadTest();
        Thread t2 = new Thread(new T_ThreadTest());

        t1.start();
        t2.start();
        System.out.println("Main");
    }
}
