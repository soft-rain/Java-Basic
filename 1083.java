﻿import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        for(int i=1; i<=n; i++){
            if(i%3==0)
                System.out.printf("X ");
            else
                System.out.printf(i + " ");
        }
    }
}