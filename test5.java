import java.util.Scanner;

abstract class generalbank{
    abstract double getsavinginterestrate();
    abstract double getfixedinterestrate();
}
class IcIcIbank extends generalbank{
    @Override
    double getsavinginterestrate(){
        return 4;
    }
    @Override
    double getfixedinterestrate(){
        return 8.5;
    }
}
class kotakmbank extends generalbank{
    @Override
    double getsavinginterestrate(){
        return 6;
    }
    @Override
    double getfixedinterestrate(){
    return 9;
    }
}
public class test5{
    public static void main(String args[]){
        generalbank r;
        r= new IcIcIbank ();
        //System.out.println(" ICICI bank Fixed interest rate:" + r.getsavinginterestrate );
           r.getsavinginterestrate();

        //System.out.println("ICICI bank saving interest rate:" + r.getfixedinterestrate);
         r.getfixedinterestrate();

         r = new kotakmbank ();
        //System.out.println("kotak bank fixed interest rate:" + r.getsavinginterestrate);
         r.getsavinginterestrate();
        //System.out.println("kotak bank saving interest rate:" + r.getfixedinterestrate);
        r.getfixedinterestrate();
      
        
    }
}