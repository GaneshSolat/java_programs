package clg_assignment;
import java.util.Scanner;
import java.util.*;
import java.io.File;

public class ass2 {
    public static void main(String[] args) throws Exception {
        File f = new File ("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh");
        String [] arr= f.list();
        for (String n: arr) {
            System.out.println(n);
        }
        int nof=0 , nod=0;
        File F = new File("");
        File[] ar = f.listFiles();
        for (File file : ar) {
            
            if(file.isFile()){
                nof++;
            }else(file.isDirectory()){
                nod++;
            }
        }
        System.out.println("number of file:"+nof);
        System.out.println("number of folder:"+nod);

    }
}
