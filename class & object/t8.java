class demo{
    demo(){
        System.out.println("constructor called.");
    }
    {
        System.out.println("instance block.");
    }
    static{
        System.out.println("static block.");
    }
}
public class t8{
    public static void main(String args[]){
        demo ob1 = new demo();
        demo ob2 = new demo();
        demo ob3 = new demo(); 
    }
}