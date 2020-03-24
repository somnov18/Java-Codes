import java.util.Scanner;

public class q2
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[3][3];
        int sum1=0,sum2=0;
        System.out.println("Enter 9 Numbers");
        //input
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //left diagonal
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                sum1=sum1+a[i][j];
            }
        }
        //right Diagonal
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i+j==2)
                sum2=sum2+a[i][j];
            }
        }
        //print
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("sum of left diagonal="+ sum1);
        System.out.println("sum of right diagonal="+ sum2);
    }
}