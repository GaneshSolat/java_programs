package clg_assignment;
import java.io.*;
import java.util.Scanner;
public class ass6 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the data Into file 1:");
    String data=sc.nextLine();
    FileOutputStream fos = new FileOutputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");
    byte[] array=data.getBytes();
    fos.write(array);
    fos.close();

    FileOutputStream fos1= new FileOutputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test3.txt");
    System.out.println("Enter the data Into file 2:");
    String data1=sc.nextLine();
    array=data1.getBytes();
    fos1.write(array);
    fos1.close();
    System.out.println("File Copied");
        FileInputStream f1=new FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");
        FileOutputStream f2=new FileOutputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test3.txt",true);
      int n;
        while ((n=f1.read())!=-1) {
           f2.write(n);
        }
           f1.close();
           f2.close(); 
            FileInputStream f3=new FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test3.txt");
              while ((n=f3.read())!=-1) {
                System.out.print((char)n);
        }    
        f3.close();
    }
     }


