import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class test2 {
    public static void main(String[] args)throws Exception {
        ArrayList<book> ob=new ArrayList<>();
        book b1 = new book(01, "Gitanjali", "Rabindranath tagor", 1000);
        book b2 = new book(02, "Gita Rahsya"," B.g.tilak", 2000); 
        book b3 = new book(03, "Glimses of world history", "P.J.neharu", 1500);
        book b4 = new book(04, "Godan", "Prem chand",1600);
        book b5 = new book(05, "Sham chi Aai", " Sane guruji", 1500);
        ob.add(b1);
        ob.add(b2);
        ob.add(b3);
        ob.add(b4);
        ob.add(b5);
        System.out.println(ob);

        for(book bo:ob){
            System.out.println(bo.getid()+" -> "+ bo.gettitle()+" -> "+ bo.getauthor()+" -> "+ bo.getprice());
        }

        int id = 01;
        boolean f=false;
        for(book bo:ob){
            if(bo.getid()==id){
                f=true;
                break;
            }
        }
        if(f=true){
            System.out.println("found Book.");
        } else{
            System.out.println("Book not found.");
        }   
    }
    
}
