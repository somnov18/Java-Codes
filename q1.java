
public class q1 {
    public static void main(String [] args) {
        int [] a = {1,2};
        try{
            a[4] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch( Exception e){
            System.out.println("Array index out of bound");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
    

}