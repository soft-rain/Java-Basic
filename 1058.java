﻿
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        if(a==0 && b==0)
            System.out.println(1);
        else
            System.out.println(0);


    }


}
