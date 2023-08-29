import java.util.Scanner;
public class additionnumber{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,b,sum=0;
        System.out.println("enter any number:");
        n=sc.nextInt();
        while(n>0){
            b=n%10;
            n=n/10;
            sum = sum+b;
        }
        System.out.println("additoin is:"+sum);
    }
}