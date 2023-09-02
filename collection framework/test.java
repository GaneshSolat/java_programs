import java.util.ArrayList;

public class test{
    public static void main(String[] args) throws Exception {
        ArrayList<student> ob=new ArrayList<>();
        student st1 = new student (101,"ganesh solat");
        student st2 = new student (102,"gaurav mate");
        student st3 = new student (103,"vaibhav nagargoje");
        ob.add(st1);
        ob.add(st2);
        ob.add(st3);

        // show all student
        for(student st:ob){
            System.out.println(st.getid()+" "+ st.getname());
        }

        // search

        int id=800;
        boolean f=false;
        for(student st:ob){
            if(st.getid()== id){
                f=true;
                break;
            }
        }
        if(f=true){
            System.out.println("found object.");
        } else{
            System.out.println("object not found.");
        }
        
        // delete
        id=200;
        for(student st:ob){
            if(st.getid()==id){
                ob.remove(st);
                break;
            }
        }
        System.out.println("after deletion");
        for(student st:ob){
            System.out.println(st.getid()+" "+st.getname());
        }
    }
}