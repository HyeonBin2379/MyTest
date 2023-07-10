package Grammer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        String a = null;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        a = r.readLine();

        System.out.println(a);
    }
}
