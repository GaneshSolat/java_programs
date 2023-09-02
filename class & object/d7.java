class demo{
    int i;
    static int j;
    demo(){
        i++;
        j++;
    }
    static void disp(){
        System.out.println("ganesh");
    }
    static void show(){
        // System.out.println(i); //can not access instatnce variable. 
        System.out.println(j);
        disp();
    }
}
public class d7{
    public static void main(String args[]){
        demo ob1 = new demo();
        demo ob2 = new demo();
        demo ob3 = new demo();
        demo.show();
    }
}