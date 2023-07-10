package Grammer;
class T_Runnable implements Runnable {
    public void run() {
        System.out.println("Run");
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        Thread t = new Thread();

        t.start();
        System.out.println("Main");
    }
}
