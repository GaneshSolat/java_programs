import java.util.*;
public class date {
    public static void main(String[] args){
        Date d1=new Date(2000,11,23);
        Date d2=new Date();
        Date d3=new Date(2010,1,3);
        boolean a= d3.after(d1);
        System.out.println("date d3 comming for date d2"+a);
        int c=d1.compareTo(d2);
        d2.setTime(239566789);
        System.out.println("after setting:"+d2);

    }
}
