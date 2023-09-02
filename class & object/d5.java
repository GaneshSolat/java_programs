class demo {
    int i,j;
    demo (int x, int y){
        i=x;
        j=y;
        System.out.println("contructor with args called.");
    }
    demo(){
        i=10;
        j=20;
        System.out.println("Contructor without args.");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class d5{
    public static void main(String args[]){
        demo ob1 = new demo(10,20);
        ob1.add();
        demo ob2 = new demo(30,40);
        ob2.add();
    }
}