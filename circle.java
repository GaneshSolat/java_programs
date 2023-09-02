import java.util.Scanner;
class circle{
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
class cylinder extends circle{
    public double height;
    public double valume(){
        return area()*height;
    }
}
public class circle1{
    public static void main(String args[]){
        cylinder c=new cylinder();
        c.radius=7;
        c.height=10;

        System.out.println("volume"+c.volume());
        System.out.println("area"+c.area());

    }
    
}