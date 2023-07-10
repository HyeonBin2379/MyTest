public class Test {
    public static void main(String[] args) throws Exception {
        int i = 0, sum = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 1)
                continue;
            sum += i;
        }
        System.out.print(sum);
    }
}