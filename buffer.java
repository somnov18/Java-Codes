import java.io.*;
public class buffer
{
    public static void main(String [] args) throws IOException {
        FileWriter fw=new FileWriter("./b1.txt",true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("hello world");
        bf.close();
        
    }
}