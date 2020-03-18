import java.util.*;
public class reverse{
    public static void main(String args[]){
        System.out.println("enter the number to be reversed:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int b=(a%10)*100;
        a/=10;
        b+=((a%10)*10);
        a/=10;
        b+=(a%10);
        a/=10;
        System.out.println("the number in reverse is "+ b);
    }
}