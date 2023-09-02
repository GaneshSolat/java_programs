import java.util.Scanner;
interface A1{
    void add(int x, int y);
}
interface B1 extends A1{
    public abstract void sub(int x, int y);
}
class demoo implements B1{
    @Override
    public void add (int x, int y){
        System.out.println(x+y);
    }
    @Override
    public void sub (int x, int y){
        System.out.println(x-y);
    }
}
public class test7{
    public static void main(String[] args) {
    B1 r= new demoo();
    r.add(100, 200);
    r.sub(10,20);
    }
}