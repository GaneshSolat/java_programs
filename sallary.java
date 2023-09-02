import java.util.Scanner;
class person {
    private String name;
}
class student extends person {
    private int id;

}
class teacher extends person{
    private double sallary;
    private String subject; 
}
class collagestudents extends student{
    private int year;
    private String branch;
}
public class test8{
    public static void main(String[] args) {
        teacher t1= new teacher("abc",10000,"Java");
        System.out.println("Teacher information:");
        //System.out.println(t1.getname());
        t1.getname();

        System.out.println(t2.get sallary());
        System.out.println(t3.get subject());

        System.out.println("Student information:");
        collagestudents s1 = new collagestudents("xyz",1,"IT");
        System.out.println(s1.get id());
        System.out.println(s2.get name());
        System.out.println(s3.get year());
        System.out.println(s4.branch());      

    }
}