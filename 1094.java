import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);

        int n = kbd.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = kbd.nextInt();

        }
        for(int i=0; i<n; i++){
            System.out.printf(arr[arr.length-i-1]+" ");
        }

    }

}

