import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
public class demolecture{
    public static void main(String[] args) throws FileNotFoundException {
        String str="I Love India";
        StringTokenizer words= new StringTokenizer(str);
        System.out.println("total tokens:"+ words.countTokens());
        while(words.hasMoreTokens()){
            System.out.println(words.nextToken());
        }
    }
}