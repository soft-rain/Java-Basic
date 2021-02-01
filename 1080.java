import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int n=kbd.nextInt();
        int sum=0;
        int i;
        for(i =0; i<10000; i++) {
            sum += i;
            if(sum>=n)break;
        }
        System.out.println(i);
    }
}
