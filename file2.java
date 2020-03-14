import java.io.*;
class file2
{
    public static void main(String [] args) throws IOException
     {
     File f2=new File("./f2.txt");
     f2.createNewFile();
     System.out.println("is exists:"+f2.exists());
     System.out.println("file size:"+f2.length());
     f2.delete();
        
    }
}