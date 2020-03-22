import java.util.Scanner;
public class large{
     public static void main(String args[])
     {
         int max,i,n;
         int a[];
         Scanner sc = new Scanner(System.in);
         System.out.print("enter n number:");
         n= sc.nextInt();
         a= new int[n];
         System.out.print("enter the number");
         for(i=0;i<n;i++)
         {
             a[i] = sc.nextInt();
         }
         max = max_num(a,n);
         System.out.println("the largets number is"+ max);
     }
     static int max_num(int a[], int n)
     {
         int i;
         int m = 0;
         for(i=0;i<n;i++)
         {
             if(a[i]>m)
             {
                 m=a[i];
             }
         }
         return m;
     }
}