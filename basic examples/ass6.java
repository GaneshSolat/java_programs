import java.io.BufferedInputStream;
import java.io.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io. FileOutputStream;
public class ass6 {
    public static void main(String[] args) throws Exception{
        File f1=new File("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");
        File f2=new File("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test3.txt");
        int x;
        do{
            x=f1.read();
            if(x!=-1){
                f2.write(x);
            }
        }while (x!=-1);
        f1.close();
        f2.close();
       System.out.println("File Copied.!");
    // if(f1.isFile() && f2.isFile()){
    //     FileInputStream fis = new FileInputStream(f1);
    //     int n;
    //     FileOutputStream fos=new FileOutputStream(f2,true);
    //     while ((n=fis.read())!=-1) {
    //        fos.write(n);
    //        fis.close();
    //        fos.close(); 
    //     }
    //     // else
        // System.out.println("invalid file name:");
    }



     }
    }

}