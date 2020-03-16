import java.io.*; //imports .file and .IOException
public class bufferreader
{
  public static void main(String [] args) throws IOException  
     { int ch;
        FileReader fr=new FileReader("./b1.txt");
        BufferedReader bf=new BufferedReader(fr);
        while((ch=bf.read())!=-1)
        {
            System.out.print((char)ch);
        }
        bf.close();
    }
}