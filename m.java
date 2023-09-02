import java.util.Scanner;
public class m{
   
       static int max (int x, int y)
        {
            if(x>y)
            return x;
            else
            return y;

        }
        public static void main(String args[]){
            int a=10, b=15, c;
            m mp=new m();
            c=max(a,b);
            System.out.print(c);
        }
}