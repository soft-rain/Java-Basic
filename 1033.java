
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        Scanner s = new Scanner(System.in);
        String n = Integer.toHexString(s.nextInt());
        System.out.printf(n.toUpperCase());
    }


}
