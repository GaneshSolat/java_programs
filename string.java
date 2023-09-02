import java.util.Scanner;
public class string{
public static void main(String[] args) {

//by using char array
                //     char[] arr={'A','B','C','D'};
                //     String s1 = new String(arr);
                //     System.out.println(s1);

 // by using byte array
                // byte[] arr1= {65,66,67,98};
                // String s2 = new String(arr1);
                // System.out.println(s2);

 // by using existing string object
                // String s3=new String(s2);
                // System.out.println(s3);

                // Strings s4="hellow world";
                // System.out.println(s4);


 // * String indexing * 
                //   String s1="hello world";
                //   int x;
                //   x=s1.length();
                //   System.out.println("number of char in string \n"+x);

 // string concat    

                //   String name="ganesh\n";
                //   int age = 19;
                //   String message= " ";
                //   message = "hello \n" + name + "your age is \n " + age;
                //   System.out.println(message);

//charAt()
                // String s1="hello world";
                // char[]arr=s1.toCharArray();
                // for(int i=0; i<arr.length; i++){
                //     System.out.println(arr[i]);
                // }
                // byte[]arr1=s1 getbyte();
                // for(int i=0; i<arr.length; i++);
                // System.out.println(arr[i]);

 //* equalsIgnorcase() 
                // String s1 = new String("hello");
                // String s2 = new String("world");

                // if(s1.equals(s2)){
                //         System.out.println("equals");
                // } else {
                //         System.out.println("not equals");
                // }
                // if(s1.equalsIgnoreCase(s2)){
                //         System.out.println("equals");
                // } else {
                //         System.out.println("not equals");
                // }
        
 //* trim function 
                // String s1=new String("hello");
                // String s2=new String("hel lo");

                // if(s1.equals(s2.trim())){
                //         System.out.println("equals");
                // }else {
                //         System.out.println("not equals");
                // }


                // String s1= "ganesh solat";
                // int x;
                // x=s1.indexOf("o");
                // System.out.println(x);
                // x=s1.lastIndexOf("t");
                // System.out.println(x);

                // x=s1.indexOf("l");
                // System.out.println(x);

 // date 10/6/23

                // String s1="hello world";
                // int x;
                // x=-1;
                // do{
                // x=s1.indexOf("l", x+1);
                // System.out.println(x);
                // }while(x!=-1);

 // concat

                // String s1="hello";
                // String s2="world";
                // String s3=s1.concat(s2);
                // System.out.println(s3);

 // substring 
                // s3="hello world";
                // String s4=s3.substring(2);
                // System.out.println(s4);
                // s4=s3.substring(2, 8);
                // System.out.println(s4);
                        
 // replace
                //  s3="hello world";
                //  String s5=s3.replace("l", "L");
                //  System.out.println(s5);
                //  s3="this is string demo";
                //  s5=s3.replace("is","IS");
                //  System.out.println(s5);

 // seprating string object
                // String s1="ganesh bhaurao solat";
                // String [] arr=s1.split("");
                // for (String s : arr) {
                //         System.out.println(s );
                // }
                // s1="a,b,c,de,f,g,h";
                // String []arr1=s1.split(",");
                // for (String s : arr1) {
                //         System.out.println(s);
                        
                // }

                // String s1="mark";
                // String s2="kate";
                // String s3="";

                // int x=s1.length();
                // if(s1.charAt(x-1)==s2.charAt(0)){
                //         s3=s1+s2.substring(1);
                // } else{
                //         s3=s1+s2;

                // }
                // System.out.println(s3);

  // * String Buffer * //
  // Lenght()
    
                // StringBuffer sb = new StringBuffer("Hello World");
                // int x;
                // x=sb.length();
                // System.out.println("length is: "+ x);
 // capacity()
                // x=sb.capacity();
                // System.out.println("capacity is:" + x);

 //CharAt()
                //StringBuffer sb = new StringBuffer("Hello World");
               //char p;
               //p=sb.charAt(2);
               //System.out.println(p);
 // SetCharAt()      
               //sb.setCharAt(2, 'L');
              //System.out.println(sb);

 // * append
                //  StringBuffer sb=new StringBuffer("Hello world");
                //  System.out.println(sb);
                //  sb.append(" ");
                //  sb.append("Hi");
                //  sb.append(" ");
                //  sb.append("123");
                //  System.out.println(sb);
 // Insert()
                // StringBuffer sb = new StringBuffer("I  JAVA");
                // System.out.println(sb);
                // sb.insert(2,"LIKE");
                // System.out.println(sb);
 // delete()
                // StringBuffer sb = new StringBuffer("Hello World");
                // System.out.println(sb);
                // sb.delete(1, 8);
                // System.out.println(sb);
 // deleteCharAt()
                // StringBuffer sb = new StringBuffer("Hello World");
                // System.out.println(sb);
                // sb.deleteCharAt(2);
                // System.out.println(sb);
        
 // Reverse
                // StringBuffer sb = new StringBuffer("Hello World");
                // System.out.println(sb);
                // sb.reverse();
                // System.out.println(sb);

// Q. To take alfanumeric string from user and print addition of numbers present in the string.4

                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter the string:");
                        String s1=sc.next();
                        byte[] arr=s1.getBytes();
                       String s2 ="";
                        int sum=0;
                        for(int i=0; i<arr.length; i++){
                                if(arr[i]>=48 && arr[i]<=57){
                                        s2="" +s1.charAt(i);
                                        int x=Integer.parseInt(s2);
                                        sum = sum + x;
                                }
                        }
                        System.out.println(sum);
  }
 } 