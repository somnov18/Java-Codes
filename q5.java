class rectangle
{
    double lenght, breadth;
    rectangle()
    {
        lenght=10;
        breadth=5;
    }
    rectangle(double lenght, double breadth)
    {
        this.lenght=lenght;
        this.breadth=breadth;
    }
    rectangle(double p)
    {
        lenght=breadth=p;

    }
    double area()
    {
        return lenght*breadth;
    }
}
public class q5{
    public static void main(String[] args) 
    {
        rectangle rect1=new rectangle();
        rectangle rect2=new rectangle(23);
        rectangle rect3=new rectangle(2.3,5.7);
        System.out.println(rect1.area());
        System.out.println(rect2.area());
        System.out.println(rect3.area());        
    }
}
