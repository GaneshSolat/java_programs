class t2{
    int i,j;
    void set(int x, int y){
        i=x; 
        j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class d2{
    public static void main(String args[]){
        t2 t=new t2();
        t.set(10,20);
        t2 t2;
        t2 =t;
        t2.set(30,40);
        t2.add();
        t2.add();

    }
}