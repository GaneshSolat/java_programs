import java.util.*;

import javax.swing.RowFilter.Entry;
import javax.swing.plaf.synth.SynthPopupMenuUI;
import javax.swing.plaf.synth.SynthSeparatorUI;
public class tm {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> ob=new TreeMap<>();
        ob.put(4,"a1");
        ob.put(2,"a2");
        ob.put(5,"a3");
        ob.put(1,"a4");
        System.out.println(ob);
        Set<Integer>mkeys=ob.keySet();
        System.out.println("All keys");{
            for(Integer k: mkeys){
                System.out.println(k);
            }
            System.out.println("All values");
            Collection<String> mvalues=ob.values();
            for(String s: mvalues){
                System.out.println(s);
            }
            System.out.println(" All items.");
            Set<Entry<Integer>>items=ob.entrySet();
            for(Entry<Integer, String>entry:items){
                System.out.println(entry.getkey()+" "+entry.getvalues());
            }
        }
    }
}
