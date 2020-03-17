import java.io.*;
public class file3
{
    public static void main(String [] args) throws IOException
    {
        int i;
      FileInputStream fin=new FileInputStream("./f3.txt");
      do{
          
          i=fin.read();
          if(i!=-1)
          System.out.print((char)i);

      }  while(i!=-1);
      fin.close();
    }
}