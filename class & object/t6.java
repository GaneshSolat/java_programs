class demo{
    int i;
    static int j;
    demo(){
        i++;
        j++;
    }
    void show(){
        System.out.println(i);
        System.out.println(j);
    }
}
public class t6{
    public static void main(String args[]){
        demo ob1 = new demo();
        demo ob2 = new demo();
        demo ob3 = new demo();
        ob1.show();
        ob2.show();
        ob3.show();
    }
}