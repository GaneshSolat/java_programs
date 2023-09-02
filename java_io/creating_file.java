package java_io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class creating_file {
    public static void main(String[] args) throws Exception{
        student s1;
        student s1 = new student();
        s1.rollnumber = 5;
        s1.stname = " ganesh ";

        String filename = "";
try {
    FileOutputStream fos = new FileOutputStream(filename);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(s1);

    oos.close();
    fos.close();
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e){
    e.printStackTrace();
}

 }
}
