﻿
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        //Scanner kbd = new Scanner(System.in);
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.printf(h + ":" + m);
    }


}