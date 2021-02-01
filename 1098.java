import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);

        int w = kbd.nextInt();
        int h = kbd.nextInt();
        int n = kbd.nextInt();
        int[][] arr = new int[w][h];
        for (int i = 0; i < n; i++) {
            int l = kbd.nextInt();
            int d = kbd.nextInt();
            int x = kbd.nextInt() - 1;
            int y = kbd.nextInt() - 1;
            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    if (y - 1 + j < 100 - h) {
                        arr[x][y + j] = 1;
                    }

                } else {
                    if (x - 1 + j < 100 - w) {
                        arr[x + j][y] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

