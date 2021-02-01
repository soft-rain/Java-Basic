import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = kbd.nextInt();
            }
        }
        int x=1, y=1;
        while(x<10 && y<10){
            if(arr[x][y]==2) {
                arr[x][y] = 9;
                break;
            }
            arr[1][1]=9;
            if(arr[x][y+1]==0){
                arr[x][y+1]=9;
                y++;
            }
            else if(arr[x][y+1]==2){
                arr[x][y+1]=9;
                break;
            }
            else if(arr[x+1][y]==0){
                arr[x+1][y]=9;
                x++;
            }
            else if(arr[x+1][y]==2){
                arr[x+1][y]=9;
                break;
            }
            else{
                break;
            }

        }



        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


