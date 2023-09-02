package clg_assignment;
   import java.io.*;
import java.util.Scanner;
public class ass7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        FileWriter fw = new FileWriter("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\text1.txt");
        String str;
        do {
            str = sc.next();
            if (str.equals("stop"))
                break;
            fw.write(str + "\n");
        } while (!str.equals("stop"));
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\text1.txt"));
        int max = 0;
        String temp = " ";
        while ((str = br.readLine()) != null)
        {
            if (str.length() > max) {
                max = str.length();
                temp = str;
            }
        }
        System.out.println("String Name: " + temp + "\n size: " + max);
        br.close();
    }
}
