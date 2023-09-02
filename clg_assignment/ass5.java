package clg_assignment;
import java.util.*;
import java.io.FileInputStream;
public class ass5 {
    public static void main(String[] args) throws Exception{
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
         FileInputStream fis = new  FileInputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");
         System.out.println("\n1.Read All Character. \n 2. Read Alternate Character. \n 3.Read Every Thard Character. \n Enter your choice.");
         choice =sc.nextInt();
         int n;
         switch(choice){
            case 1:
            while((n = fis.read())!=-1)
             System.out.print((char)n);
             break;
             case 2:
            while((n = fis.read())!=-1)
            {
              System.out.print((char)n);
              fis.skip(1);
            }
            break;
            case 3:
            fis.skip(2);
            while((n = fis.read())!=-1){
                 System.out.print((char)n);
                 fis.skip(2);
            }
            break;
         }
        }while(choice!=4);
}
}
