import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();

        int day = 1;
        while(day%a!=0 || day%b!=0 ||day%c!=0)
            day++;
        System.out.println(day);

    }
}
