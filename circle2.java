import java.util.Scanner;
class circlee{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
    return * Math.PI * Math;
    }
    public double circumference()
    {
        return perimeter();

    }
}
class cylinder1 extends circlee{
    public double height;
    public double valume(){
        return area()*height;
    }
}
public class circle2{
    public static void main(String args[]){
        cylinder1 c=new cylinder1();
        c.radius=7;
        c.height=10;

        System.out.println("volume"+c.volume());
        System.out.println("area"+c.area());

    }
    
}