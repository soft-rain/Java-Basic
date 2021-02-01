
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        System.out.println(n1+n2+n3);
        System.out.printf("%.1f", (double)(n1+n2+n3)/3);


    }


}
