
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        int year = Integer.parseInt(st.nextToken());
        int mon = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        System.out.printf("%02d-%02d-%4d", day, mon, year);
    }


}
