﻿
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();

        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        if(b%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        if(c%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }


}
