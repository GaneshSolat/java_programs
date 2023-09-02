class demo{
    int i,j;
    demo(int x, int y){
        i=x;
        j=y;
        System.out.println("constructor with args called");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class t4{
    public static void main(String args[]){
        demo ob1= new demo(10,20);
        ob1.add();
        demo ob2= new demo (3,40);
        ob2.add();
    }
}