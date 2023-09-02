package java_io;

import java.io.FileInputStream;

public class test {
public static void main(String[] args) throws Exception {
    byte []arr = new byte [100];
    FileInputStream fin;
    fin = new FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test.txt");
    int x;
    do{
        x=fin.read(arr);
        if(x!=-1){
            String s1=new String (arr);
            System.out.println(s1);
        }
    }while (x!=-1);
    fin.close();
}
    
}
