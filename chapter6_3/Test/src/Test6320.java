public class Test6320 {
    public static void main(String[] args) {
        int[] result = new int[5];
        int[] arr = {79, 34, 10, 99, 59};
        for (int i = 0; i < 5; i++) {
            result[i] = 1;
            for (int j = 0; j < 5; j++)
            {
                if (arr[i] < arr[j]) result[i]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(result[i]);
        }
    }
}
