class test <T> {
    T i;
    test(T x){
        i=x;
    } 
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class generic_class_single_parametar {
    public static void main(String[] args) {
       test <Integer> ob=new test (100);
       test <String> ob1=new test ("hello");
       ob.show();
       ob1.show(); 
    }
}
