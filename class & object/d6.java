class demo(){
    int i;  
    demo(){
        i++;
    }
    void show(){
        System.out.println(i);
    }
}
public class d6{
    public static void main(String args[]){
        demo ob1 = new demo();
        demo ob2 = new demo();
        demo ob3 = new demo();
        ob1.show();
        ob2.show();
        ob3.show();
    }
}