 class demo<T,V>{
    T i;
    V j;
     demo(T x , V y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
     }
}
        public class generic {
          public static void main(String[] args) {
           demo<String,Integer> ob = new demo("Hello",100);
           ob.show();
          }
}
