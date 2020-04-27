
public class arrayoutofbound {
    public static void main(String args[])
	{
        int a[]={1,2};
	    try
	    {
	        a[8]=5;
	    }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutofBoundsException caught");
		}
	 }

}
