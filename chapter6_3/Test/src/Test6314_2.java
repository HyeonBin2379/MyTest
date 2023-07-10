class Test6314 {
    static private Test6314 instance = null;
    private int count = 0;
    static public Test6314 get() {
        if (instance == null) {
            instance = new Test6314();
        }
        return instance;
    }
    public void count() {count++;};
    public int getCount() {return count;}
}

public class Test6314_2 {
    public static void main(String[] args) {
        Test6314 s1 = Test6314.get();
        s1.count();
        System.out.println(s1.getCount());
        Test6314 s2 = Test6314.get();
        s2.count();
        System.out.println(s1.getCount());
        Test6314 s3 = Test6314.get();
        s3.count();
        System.out.println(s1.getCount());
        System.out.print(s1.getCount());
    }
}
