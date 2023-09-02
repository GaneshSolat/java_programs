import java.util.Scanner;
class animal{
     void eat(){
        System.out.println("\n what does a parrot eat ? ");
    }

     void sleep(){
        System.out.println(" \n whare does the parrot live ? ");
    }
}
class bird extends animal{
    @Override
     void eat (){
        System.out.println("parrot eats pomegranate... ");
    }
     @Override
     void sleep (){
        System.out.println(" parrot lives in a nest...");
    }
     void fly (){
        System.out.println("\n parrot flies in the sky... ");
    }
}
public class test2 {
    public static void main(String args[]){
    animal a = new animal();
    bird b = new bird();
    a.eat();
    b.eat();
    a.sleep();
    b.sleep();
    b.fly(); 
    }
}