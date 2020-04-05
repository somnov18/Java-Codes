import java.util.*;
public class toupper {
    public static void main(String [] args) {

        System.out.println("enetr a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.toUpperCase();
        System.out.println("String in upper case is:"+s);
    }

}