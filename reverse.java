import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        System.out.println("enter the number to be reversed:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0,rem;
        while(a != 0)
        {
            rem = a%10;
            rev = rev*10 + rem;
            a = a/10;
        }
        System.out.println("the number in reverse is "+rev);
    }
}
