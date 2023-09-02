class t1 {
    int i,j;
    void set (int x, int y){
        i=x;
        j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class d1{
    public static void main(String args[]){
     t1 t=new t1();
     t.set(50,20);
     t1 t2=new t1();
     t2.add();
     t2.add();
    }
}
