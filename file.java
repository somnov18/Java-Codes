import java.io.*;
public class file
{
    public static void main(String [] args) throws IOException
    {
        int i;
        FileOutputStream fout=new FileOutputStream("./f3.txt",true);
        String s="HELLO WORLD";
        char ch[]=s.toCharArray();
        for(i=0; i<s.length(); i++)
        fout.write(ch[i]);
        fout.close();
    }
}