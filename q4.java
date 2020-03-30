class account{
    public int acc_no=1806524, balance=2000;
    void display(){
        System.out.println("account number:"+acc_no);
        System.out.println("balanced:"+balance);

    }
}
class person extends account{
    String name = "somyak";
    int aadhar= 1234;
    void display()
    {
        System.out.println("account number:"+acc_no);
        System.out.println("balance:"+balance);
        System.out.println("name:"+name);
        System.out.println("aadhar number:"+aadhar);
    }
    public static void main(String[] args) {
        person obj = new person();
        obj.display();
        
    }
}
