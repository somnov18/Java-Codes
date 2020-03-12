import java.util.Scanner;

class Account
{
    private int balance;
    
    public void setBalance(int bal)
    {
        balance=bal;

    }
    public  boolean isSufficientBalance(int w) {
        
        if (balance > w)

            return (true);  

        else
            return(false);
    }

    public void withdraw(int amt)
     {
    
        balance = balance - amt;
        System.out.println("withdrawn amount is:" + amt);
        System.out.println("balance amount is:" + balance);
    }
}

class customer implements Runnable {
    private Account acc;
    private String name;

    public customer(Account a ,String n) {
        acc = a;
        name = n;
    }

    public void run() 
    {
        Scanner sc = new Scanner(System.in);
        synchronized(acc)
        {
        System.out.println(name+":" + "enter amount to withdraw:");
        int amt = sc.nextInt();
        if(acc.isSufficientBalance(amt))
        {
           System.out.println(name);
            acc.withdraw(amt);

        }
        else
         System.out.println("insufficient balance");
        }
    }
}
public class thread
{
    public static void main(String[] args) 
    {
        Account a1= new Account();
        a1.setBalance(1000);
        customer c1=new customer(a1,"raj"), c2=new customer(a1,"simran");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}
