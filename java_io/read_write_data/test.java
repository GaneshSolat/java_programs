package java_io.read_write_data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class test {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout;
        fout = new FileOutputStream("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test.txt");

        DataOutputStream dout;
        dout = new DataOutputStream(fout);

        dout.writeInt(100);
        dout.writeBoolean(true);
        dout.writeFloat(1.2f);
        System.out.println("File Copied..!");
        }
}
