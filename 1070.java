
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        String a = kbd.next();

        switch (a){
            case "12": case "1": case "2":
                System.out.printf("winter");
                break;
                
            case "3": case "4": case "5":
                System.out.printf("spring");
                break;

            case "6": case "7": case "8":
                System.out.printf("summer");
                break;

            case "9": case "10": case "11":
                System.out.printf("fall");
                break;


        }

    }


}
