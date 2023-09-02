import java.util.Scanner;
class NegativeIdException extends RuntimeException{
    @Override
    public String toString() {
        return "Id can't be negative.";
    }
}
class student1{
    private int id;
    int age;
    private string name;
    public void setId(int id){
        if(id<0){
            NegativeIdException ex;
            ex= new NegativeIdException ();
            throw ex;
        }
        this.id = id;
    }
    public string getName(){
        return name;
    }
    public void setName(string name){
        this.name=name;
    }
}
public class test12{
    public static void main(String[] args) {
        student1 st=new student1();
        st.setId(-100);
        st.setName ("ganesh"); 
        System.out.println("Id" + getId);
        System.out.println("Name" + getName);
    }
}