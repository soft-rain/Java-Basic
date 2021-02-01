import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[19][19];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = kbd.nextInt();
            }
        }
        int n = kbd.nextInt();
       
        for (int i = 0; i < n; i++) {
            int x = kbd.nextInt();
            int y = kbd.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (arr[x - 1][j] == 0)
                    arr[x - 1][j] = 1;
                else
                    arr[x - 1][j] = 0;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][y - 1] == 0)
                    arr[j][y - 1] = 1;
                else
                    arr[j][y - 1] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}

