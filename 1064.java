
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();
        System.out.println(c > (a > b ? b : a) ? (a > b ? b : a) : c);


    }


}
