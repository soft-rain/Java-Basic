
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        if(a<=100 && a>=90)
            System.out.println('A');
        else if(a<90 && a>=70)
            System.out.println('B');
        else if(a<70 && a>=40)
            System.out.println('C');
        else
            System.out.printf("D");


    }


}
