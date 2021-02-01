
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2);

        System.out.println(sb);
    }


}
