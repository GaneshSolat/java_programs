import java.util.Scanner;
class test{
    void number(){
        System.out.println("9370239025");
    }
  final  void atmpin(){
        System.out.println("3689");
    }
}
class thief extends test{
    @Override
    void number()
    {
        System.out.println("9370239025");
    }
    // @Override
    // void atmpin()
    // {
    //     System.out.println("3689");
    // }
}
 public class final {
    public static void main(String args[]){
    
        thief t=new thief();
        t.number(); 
        t.atmpin();
 
          }
}