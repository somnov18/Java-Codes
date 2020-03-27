class base{
    void show(){
        System.out.print("parent method");
    }
}
class q2 extends base{
    void show(){
        System.out.print("child method");
    }
    public static void main(String[] args) {

        base obj = new q2();
        obj.show();
    }
}
