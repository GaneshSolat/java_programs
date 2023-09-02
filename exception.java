 import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
 class exception{
   // public static void main(String args[]){

        // * Exception Handling  . 
                     // int a , b, c;
                     // Scanner sc = new Scanner(System.in);
                     // System.out.println("enter two number:");
                     // a=sc.nextInt();
                     // b=sc.nextInt();
                     // c=a/b;
                     // System.out.println("Div is:"+c);
                     // System.out.println("End");
            
         // * Handling Exception in program

                     // int a , b, c;
                     // Scanner sc = new Scanner(System.in);
                     // System.out.println("enter two number:");
                     // a=sc.nextInt();
                     // b=sc.nextInt();
                     // try {
                     // c=a/b;
                     // System.out.println("Div is:"+c);
                     // } catch (ArithmeticException e) {
                     // System.out.println("Can't Devided by Zero.");
                     // }
                     // System.out.println("End");


        // * try with multicatch
            
              
                     // int a , b, c;
                     // Scanner sc = new Scanner(System.in);
                     // System.out.println("enter two number:");
                     // a=sc.nextInt();
                     // b=sc.nextInt();
                     // try {
                     // a=sc.nextInt();
                     // b=sc.nextInt();
                     // c=a/b;
                     // System.out.println("Div is:"+c);
                     // } catch (ArithmeticException e) {
                     // System.out.println("Can't Devided by Zero.");
                     // }catch (InputMismatchException e) {
                     // System.out.println("Enter Number Only.");
                     // }
                     // System.out.println("End");

        // * Nested try catch 
                            
                     // int a , b, c;
                     // int [] arr= new int [5];
                     // Scanner sc = new Scanner(System.in);
                     // System.out.println("enter two number:");
                     // a=sc.nextInt();
                     // b=sc.nextInt();
                     // try {
                     //        try {
                     //               arr[b]=100;
                     //        } catch (ArrayIndexOutOfBoundsException e) {
                     //               System.out.println("Index is not valid.");    
                     //        }
                     // c=a/b;
                     // System.out.println("Div is:"+c);
                     // } catch (ArithmeticException e) {
                     // System.out.println("Can't Devided by Zero.");
                     // }
                     // System.out.println("End");

        // *handling multiple exception using single catch block.

                     // int a,b,c;
                     // Scanner sc= new Scanner(System.in);
                     // System.out.println("Enter two number:");
                     // try {
                     //        a=sc.nextInt();
                     //        b=sc.nextInt();
                     //        c=a/b;
                     //        System.out.println("Div is:"+c);
                     // } catch (ArithmeticException | InputMismatchException e) {
                     //   if(e instanceof ArithmeticException){
                     //        System.out.println("can't divided by zero.");
                     //   } else if(e instanceof InputMismatchException ) {
                     //        System.out.println("enter number only.");
                     //   }
                     // }
                     // System.out.println("End");

        // * Universal catch block. 

                        // int a,b,c;
                        // Scanner sc=new Scanner(System.in);
                        // System.out.println("enter two number:");
                        // try {
                        //     a=sc.nextInt();
                        //     b=sc.nextInt();
                        //     c=a/b;
                        //     System.out.println("div is:"+c);
                        // } catch (Exception e) {
                        //     System.out.println(e.getMessage());
                        //     System.out.println(e.getStackTrace());
                        // }
         // Throw Keyword
                        // int a,b,c;
                        // Scanner sc=new Scanner (System.in);
                        // System.out.println("enter two number:");
                        // try {
                        //     a=sc.nextInt();
                        //     b=sc.nextInt();
                        //     if(b==0){
                        //         ArithmeticException ex;
                        //         ex=new ArithmeticException();
                        //        throw ex;
                        //     }
                        //     c=a/b;
                        //     System.out.println("div is"+c);

                        // } catch (ArithmeticException e) {
                        //     System.out.println("cant't divided by zero" );                           
                        // }
                        // System.out.println("End");
  //  }

 // Q. Why we used throw keyword

                        // static int div (int x, int y){
                        //     int z=0;
                        //     try{
                        //         z=x/y;
                        //     } catch (ArithmeticException e){
                        //         throw e;
                        //     } return z;
                        // }
                        // public static void main(String argsp[]){
                        //     int a;
                        //     a=div(10,0);
                        //     System.out.println("Div is"+a);
                        //     System.out.println("end");
                        // }
                        
 }