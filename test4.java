abstract class account {
    void getcustmor(){
        System.out.println("get customer information:");
    }
    abstract void calculationintrest();
}
class saving extends account{
   @Override
    void calculationintrest(){
        System.out.println("calculate interest of saving account:");
    }
}
class loan extends account{
    @Override
    void calculationintrest(){
        System.out.println("Calculate intrest of loan account:");
    }
}
public class test4{
    public static void main(String args[]){
        account r;
        r= new saving();
        r. getcustmor();
        r. calculationintrest();
        r= new loan();
        r.calculationintrest(); 
    }
}