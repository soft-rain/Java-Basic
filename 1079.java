import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        while(true){
            char n = kbd.next().charAt(0);
            if(n=='q'){
                System.out.println(n);
                break;
            }
            else
                System.out.println(n);
        }
    }
}
