import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);

        int n = kbd.nextInt();
        int[] arr = new int[n];
        int[] count = new int[23];
        for(int i=0; i<n; i++){
            arr[i] = kbd.nextInt();
            count[arr[i]-1]++;
        }
        for(int i=0; i<count.length; i++){
            System.out.printf(count[i]+" ");
        }

    }

}

