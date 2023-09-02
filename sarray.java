import java.util.Scanner;
public class sarray{
    public static void main(String args[]){
                  // Rotating in array

        // int A[]={3,9,7,8,12,6,15,5,4,10};

        // for(int X:A)
        // System.out.print(X+",");
        // System.out.println(" ");

        // int temp=A[0];
        // for(int i=1; i<A.length; i++){
        //     A[i-1]=A[i];
        // }
        // A[A.length-1]=temp;

        // for(int X:A)
        //  System.out.print(X+",");
        //  System.out.println(" ");

                                    // inserting in array

                                int a[]=new int[10];
                                a[0]=3;a[1]=9;a[2]=7;a[3]=8;a[4]=12;a[5]=6;

                                int n=6;

                                for(int i=0; i<n; i++)
                                System.out.print(a[i]+",");
                                System.out.println("");

                                int x=20;
                                int index=2;

                                for(int i=n;i>index;i--)
                                a[i]=a[i-1];
                                a[index]=x;

                                for(int i=0; i<n; i++)
                                System.out.print(a[i]+",");
                                System.out.println("");



                                 



    }
}