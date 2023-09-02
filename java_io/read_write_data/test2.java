package java_io.read_write_data;
import java.util.*;
import java.io.FileInputStream;
import java.io.DataInputStream;
public class test2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test.txt");

        DataInputStream din;
        din = new DataInputStream(fin);
        
        int a=din.readInt();
        Boolean b=din.readBoolean();
        Float c=din.readFloat();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        din.close();
    }
}
