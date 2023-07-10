package Grammer;
class Method {
    static void print()
    {
        System.out.println("static method");
    }
}
public class StaticMain {
    public static void main(String[] args) {
        Method.print();
    }
}
