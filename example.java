class A implements Runnable
{
public void run()
{
 int i;
 for(i=0;i<=10;i++)
 System.out.println("thread a"+i);
}
}
class B implements Runnable
{
public void run()
{
 int i;
 for(i=0;i<=10;i++)
 System.out.println("thread b"+i);
}
}
public class example
{
public static void main(String[] args)
{
    A obj1=new A();
    B obj2=new B();

 Thread t1=new Thread(obj1);
 Thread t2=new Thread(obj2);
 t1.start();
 t2.start();
 }
}
