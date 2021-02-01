
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            int result = (str.charAt(i)-'0') * ((int)Math.pow(10, str.length()-i-1));
            System.out.println("["+result+"]");
        }

    }


}
