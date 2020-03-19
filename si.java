import java.util.*;
public class si{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the rate:");
        double  r= sc.nextDouble(); 
        System.out.println("enter time:");
        double t= sc.nextDouble();
        System.out.println("enter principal amount:");
        double p= sc.nextDouble();
        double s=(p*r*t)/100;

    System.out.println("simple interest="+ s);
    }
}