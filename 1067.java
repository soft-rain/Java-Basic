﻿
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        if(a>0)
            System.out.println("plus");
        else
            System.out.println("minus");
        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

    }


}
