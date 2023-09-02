import java.util.Scanner;
class krushisevakenrda{
    void fertilizers(){
        System.out.println("Fertilizers Name ");
    }
    void price(){
        System.out.println("how many price \n ");
    }
}
class Fertilizers extends krushisevakenrda{
    void Uria(){
        System.out.println("Uria. ");
        System.out.println("2000\n");
    }
    void SuperPhaspate (){
        System.out.println("SuperPhaspate");
        System.out.println("800\n");
    }
    void Phospate (){
        System.out.println("phospate ");
        System.out.println("1000\n");
    }
}
public class farmer {
    public static void main(String args[]){
        krushisevakenrda a = new  krushisevakenrda();
        Fertilizers b = new Fertilizers();
        a.fertilizers();
        a.price();
        b.Uria();
        b.SuperPhaspate();
        b.Phospate ();
    }
}