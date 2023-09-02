package clg_assignment;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.print.attribute.IntegerSyntax;
public class clgpractice {
    public static void main(String[] args) throws NumberFormatException , Exception{
        FileWriter fw = new FileWriter("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt");
        int r[]=new int[]{1,2,3};
        String name[] = new String[]{"ganesh","vaibhav","gaurav"};
        fw.write(new Integer(r[0]).toString()+" \n"+ name[0]);
        fw.write(new Integer(r[1]).toString()+"\n" + name[1]);
        fw.write(new Integer(r[2]).toString()+"\n" + name[2]);
        fw.close();
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt"));
        String s ; int rn;
        while((s=br.readLine())!=null);
        {
            rn=Integer.parseInt(s);
            s=br.readLine();
            System.out.println("rno="+rn+"name"+s);
        }
        br.close();
        

        
    }
}
