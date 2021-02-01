import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a =kbd.nextInt();
        int r =kbd.nextInt();
        int n =kbd.nextInt();
        System.out.printf("%.0f", a*Math.pow(r,n-1));

    }
}
