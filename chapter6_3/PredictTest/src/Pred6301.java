public class Pred6301 {
    public static void main(String[] args) {
        int x = 1;
        int tX = 0, t_X = 0;

        tX = (x > 0) ? x : -x;
        if (x > 0)
            t_X = x;
        else
            t_X = -x;
        
        System.out.println(tX + " " + t_X);
    }
}
