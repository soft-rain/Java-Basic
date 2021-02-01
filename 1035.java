
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
        int n = Integer.valueOf(s.next(), 16);
        String x = Integer.toOctalString(n);
        System.out.println(x);
    }


}
