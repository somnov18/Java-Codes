class base{
    public base(int x, int y){
        System.out.print("parent parametrized constructor\n");

    }
}
class q3 extends base{
    public q3(int a, int b){
        super(a,b);
        System.out.print("child parametrized constructor");
    }
    public static void main(String[] args) {
        q3 ob = new q3(1,2);
    }
}