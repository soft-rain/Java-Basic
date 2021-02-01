import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        long a = kbd.nextLong();
        long m = kbd.nextLong();
        long d = kbd.nextLong();
        long n = kbd.nextLong();
        for(int i=1; i<n; i++) {
            a = (a*m)+d;
        }
        System.out.println(a);

    }
}
