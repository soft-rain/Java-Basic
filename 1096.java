import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        boolean[][] arr = new boolean[20][20];
        for(int i=0; i<n; i++){
            int x = kbd.nextInt();
            int y = kbd.nextInt();
            arr[x][y]=true;
        }
        for(int i=1; i<20; i++){
            for(int j=1; j<20; j++){
                if(arr[i][j]==true)
                    System.out.printf("1 ");
                else
                    System.out.printf("0 ");
            }
            System.out.println();
        }

    }
}
