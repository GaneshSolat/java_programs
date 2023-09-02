import java.util.Scanner;
public class mark{
    public static void main(String args[]){
        int m1, m2, m3;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter your 3 subject marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;
        if (avg>=90)
        {
            System.out.println("first class:");
        }
        else if(avg>=70 && avg<90)
        {
            System.out.println("second class:");
        }
        else if (avg>=50 && avg<70)
        {
            System.out.println("Third class:");
        }
        // else if(avg>=40 && avg<50)
        // {
        //     System.out.println("pass class:");
        // }
        else
        {
            System.out.println("sorry fail...!");
        }
        }
    }