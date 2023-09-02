import java.util.Scanner;
public class odd{
    public static void main(String args[]){
        int n; 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        n=sc.nextInt();
        
        if(n<=18)
        {
         System.out.println("this pereson is young");   
        }
        else{
            System.out.println("this person is not young");
        }
    }
}