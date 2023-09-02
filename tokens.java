import java.util.Scanner;
import java.util.StringTokenizer;
public class tokens {
   public static void main(String[] args) {
    String str; float grade, total=0.0f; 
    int count;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    StringTokenizer tokens=new StringTokenizer(str);
    while(tokens.hasMoreTokens()) {
        grade=Float.parseFloat(tokens.nextToken());
        total=total+grade;
        count ++;
    }
    if(count>=0)
    System.out.println("averave="+total/count);
   } 
}
