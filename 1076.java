import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        char n = kbd.nextLine().charAt(0);

        for(int i=97; i<=(int)n; i++){
            System.out.println((char)i);
        }

    }
}
