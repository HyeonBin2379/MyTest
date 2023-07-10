class Car implements Runnable {
    int a;
    public void run() {
        System.out.println("Car");
    }
}
public class Test6318 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car());
        t1.start();
    }
}
