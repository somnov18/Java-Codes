import java.util.Scanner;

public class q3
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int i,j,n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Numbers");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the sum of the pair:");
        int sum= sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++){
                if(a[i]+a[j]==sum)
                    System.out.println("("+a[i]+","+a[j]+")");
            }
        }
    }
}
