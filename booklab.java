import java.util.Scanner;
class lab{
    void book(){
        System.out.println("book Name ");
    }
    void price(){
        System.out.println("how many price \n ");
    }
}
class books extends lab{
    void java(){
        System.out.println("java book. ");
        System.out.println("500\n");
    }
    void python (){
        System.out.println("Python book. ");
        System.out.println("700\n");
    }
    void cpp (){
        System.out.println("cpp ");
        System.out.println("300\n");
    }
}
public class booklab {
    public static void main(String args[]){
        lab a = new lab();
        books b = new books();
        a.book();
        a.price();
        b.java();
        b.python();
        b.cpp();
    }
}