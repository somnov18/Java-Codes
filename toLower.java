import java.util.*;
public class toLower{
    public static void main(String [] args) {

        System.out.println("enetr a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.toLowerCase();
        System.out.println("String in lower case is:"+s);
    }
}