package ganesh;
import java.util.Scanner;
public class file {
    public static void main(String[] args) throws Exception {
        file fin = new file.reader("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh");
        int x;
        do{
            x=fin.read();
            System.out.println((char)x);
        } while (x!=-1);
        fin.close();
        
    }
}
