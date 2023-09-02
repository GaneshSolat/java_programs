import java.util.Scanner;
interface demo2 {
    void add (int x, int y);
}
class x1 extends demo2 {
    public abstract void sub (int x, int y);
}
class demo implements x1 {
    @Override 
    public void add (int x, int y){
        System.out.println(x+y);
    }
    @Override
    public void sub(int x, int y){
    System.out.prinln(x-y);
    }
}
public class test6{
 public static void main(String[] args) {
     x r= new x ();
     r.add (100,200);
     r.sub (90,80);   
    }
}