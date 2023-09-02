package java_io;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_copy {
    public static void main(String[] args) throws Exception{
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test.txt");
        FileOutputStream fout;
        fout = new FileOutputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");

        int x;
        do{
            x=fin.read();
            if(x!=-1){
                fout.write(x);
            }
        }while(x!=-1);
        fin.close();
        System.out.println("File copied..!");

    }
}
