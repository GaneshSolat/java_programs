package clg_assignment;
import java.util.*;
import java.io.File;
public class a1 { 
  public static void main(String[] args)throws Exception {

   File f1 = new File("C:\\Users\\user5\\OneDrive\\Desktop\\ganesh\\test2.txt"); 
        // get the name of file
   System.out.println("Name:" + f1.getName());
         // get the path of file
   System.out.println("path of file:" + f1.getPath()); 
        // get the parent directory of file
   System.out.println("parent directrory of file:" + f1.getParent()); 
        // get the absolute path of the file
   System.out.println("absolute:" + f1.getAbsoluteFile());
        // get the canoncial path of the file
   System.out.println("canoncial:" + f1.getCanonicalPath());
        // modify of the file
   System.out.println("modification:" + f1.lastModified());
        // this fun() is used to file exists or not
   System.out.println("exists:" + f1.exists());
        // this fun() is use to file write of not. 
   System.out.println("write:" + f1.canWrite());
        // this fun() is used file read or not
   System.out.println("Read:" + f1.canRead());
        // this fun() is used file parent or not 
   System.out.println("file:" + f1.isFile());
        // is use to directory is present or not 
   System.out.println("directory:" + f1.isDirectory());
         // is used to this absolute prsent or not 
   System.out.println("Absolute:" + f1.isAbsolute());
          // is used to this file hidden or not
   System.out.println("hidden:" + f1.isHidden());
          // is used to this length of file
   System.out.println("length:" + f1.length());
         // this fun() is used to directory is single directory or not
   System.out.println("mkdir:" + f1.mkdir());
        // this fun() is used to this directory is multiple directory or not
   System.out.println("mkdirs:" + f1.mkdirs());
   System.out.println("List:" + f1.list());
   System.out.println("listfile:" + f1.listFiles());
        // create new file 
    System.out.println("New:" + f1.createNewFile());
        // delete the file
   //System.out.println("delete:" + f1.delete());
  }  
}
