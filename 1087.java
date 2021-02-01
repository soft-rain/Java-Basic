import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        long n =kbd.nextLong();
        long sum=0;
        for(int i=1; i<10000000; i++){
            sum+=i;
            if(sum>=n){
                System.out.println(sum);
                break;
            }
        }

    }
}
