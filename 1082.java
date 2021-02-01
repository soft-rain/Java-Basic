import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        String s = kbd.next();
        int n = Integer.parseInt(s, 16);
        for(int i=1; i<16; i++){
            System.out.format("%X*%X=%X%n",n,i,n*i);        }
    }
}
