class t3{
    int i,j;
     test20 (){
        i=10;
        j=20;
        System.out.println("constructor called:");
    }
    void add()
    {
        System.out.println(i+j);
    }
}
public class d3{
    public static void main(String args[]){
        t3 t1= new t3();
        t3 t2= new t3();
        t1.add();
        t2.add();
    }
}