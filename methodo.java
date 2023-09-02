import java.util.Scanner;
public class methodo{
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;

        }
        return z;
    }

    public static void main(String[] args) {
        int a1=5;
        int b1=7;
        int  c;
        c=logic(a1, b1);
        // methodo obj = new methodo();
        System.out.println(c);   
        //System.out.println(z);
        
        
    }
}