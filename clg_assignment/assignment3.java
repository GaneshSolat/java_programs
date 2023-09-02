package clg_assignment;
import java.io.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a name");
        s = sc.next();
        byte b[]=s.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int n;
        while((n=bis.read())!=-1){
            System.out.print(Character.toLowerCase((char)n));
        }
    }
}
