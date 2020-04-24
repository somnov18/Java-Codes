import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.*;
public class q5 {
    public static void main(String[] args)throws IOException {
        int i=0;
        try{
            FileReader fr = FileReader("abc.txt");
            BufferedReader br = BufferedReader(fr);
            FileWriter fw = new FileWriter("xyz.txt",true);
            String s;
            while ((s = br.readLine())!= null){
                fw.write(s);
            }
            br.close();
            fw.close();
            System.out.println("File copied");
        }
       
        catch(IOException e){
            System.out.println("File error");
        }
    }

}