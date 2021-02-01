import java.util.*;
class Main{
    public static void main (String[] args){
        float a;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        String b = String.format("%06f",a);
       s.close();
       System.out.println(b);
    }
}
