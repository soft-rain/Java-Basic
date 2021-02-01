import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long w = Integer.parseInt(st.nextToken());
        long h = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        double res = w*h*b;
        double result = res/8/1024/1024;
        System.out.printf("%.2f MB", result);
    }
}
