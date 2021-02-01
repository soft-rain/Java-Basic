import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        while(true){
            int n = kbd.nextInt();
            if(n==0)
                break;
            else
                System.out.println(n);
        }
        
    }
}
