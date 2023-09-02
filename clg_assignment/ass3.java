package clg_assignment;
import java.util.Scanner;
import java.io.*;
public class ass3 {
    public static void main(String[] args) throws Exception {
        String dirpath;
        String ext;
        int nof=0,nod=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path:");
        dirpath = sc.nextLine();
        File f=new File(dirpath);
        System.out.println("Accept extention:");
        ext=sc.next();
        if(f.isDirectory()){
            String str[]=f.list();
            for(String s: str){
                File f1=new File(dirpath , s);
                if((f1.isFile()) && (s.endsWith(ext))){
                    System.out.println(s+"  is a file");
                    nof++;
                }
                else {
                    System.out.println(s+" is a Directory");

        }
             }
        }
    }
    
}
