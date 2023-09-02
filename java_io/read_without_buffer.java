package java_io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class read_without_buffer {
    public static void main(String[] args) throws Exception{
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test.txt");

    BufferedInputStream bin;
    bin = new BufferedInputStream(fin);

    FileOutputStream fout;
    fout = new FileOutputStream ("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");

    BufferedOutputStream  bout;
    bout = new BufferedOutputStream(fout);

    int x;
    do{
        x=bin.read();
        if(x!=-1){
            bout.write(x);
        }
    }while (x!=-1);
    bin.close();
    bout.close();
    System.out.println("File Read..!");
    



    }
}
