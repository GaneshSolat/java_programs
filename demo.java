import java.util.Scanner;
class a {
    void input()
    {
        System.out.println("what is your name:");

    }
}
class b extends a{
    void show(){
        System.out.println("My name is Ram. ");
    }
    void disp(){
      System.out.println("my name is Sham.");

    }
}
class demo{
    public static void main(String args[]){
       a ob1 = new a ();
       ob1.input();

       b b = new b();
       b.show();
       b.disp();
       
    }
}