package clg_assignment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;
// import java.util.stream.Stream;

public class assignnment4 {
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            String s;
            System.out.println("Enter a name");
            s = sc.nextLine();
            byte b[]=s.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(b);
            int n;
            char c;
            ByteArrayOutputStream bos = new ByteArrayOutputStream (b.length);
            while((n=bis.read())!=-1){
               c=(char)n;
                if (Character.isUpperCase(c)){
                    c=Character.toLowerCase(c);
                }
                else if(Character.isLowerCase(c)){
                    c=Character.toUpperCase(c);
                }
                bos.write((int)c);
            }
             System.out.print(bos.toString());
        }
    }
}
 