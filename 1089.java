import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a =kbd.nextInt();
        int d =kbd.nextInt();
        int n =kbd.nextInt();
        System.out.println(a+d*(n-1));

    }
}
