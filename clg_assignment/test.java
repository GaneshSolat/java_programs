package clg_assignment;
import java.util.*;
import java.io.FileInputStream;
public class test {
    public static void main(String[] args) throws Exception{
         FileInputStream fis = new  FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");
         int n;
         while((n = fis.read())!=-1){
            n = fis.read();
            System.out.print((char)n);
            fis.skip(1);
         }
         fis.close();
    }
}
