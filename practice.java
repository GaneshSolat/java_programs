import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        /*  float[] marks={ 45.7f, 67.8f, 63.4f, 99.2f,100.0f};
        float sum=0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is "+sum);*/

                // check value in array of present or not present.. 

        /*float [] marks = { 45.7f, 67.8f, 63.4f, 99.2f,100.0f};
        float num = 45.07f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
         if(isInArray){
            System.out.println("the value is present in the array:");
         }
         else
         {
            System.out.println("The value is not present in the array:");
         }*/

                   // cheack average in array..

        /*  float [] marks = { 45.7f, 67.8f, 63.4f, 99.2f,100.0f};
         float sum =0 ;
         for(float element:marks){
            sum = sum+element;
         }
         System.out.println("the value of average marks is"+ sum/ marks.length);*/ 
    

                 // Add to matrix of size 2x3 
        
    /* ;       int [][] mat1 = {{1,2,3},
                            {4,5,6}};
            int [][] mat2= {{2,6,13},
                            {3,7,1}};
            int [][] result = {{0,0,0},
                               {0,0,0}};
                               
            for(int i=0; i<mat1.length; i++){
                for(int j=0; j<mat1[i].length; j++){
                    System.out.format("Setting value for i=%d and j=%d\n", i,j);
                    result[i][j] = mat1[i][j] + mat2[i][j]; 

                }
            }
            for(int i=0; i<mat1.length; i++){
                for(int j=0; j<mat1[i].length; j++){
                    System.out.print(result[i][j]+" ");
                    result[i][j] = mat1[i][j] + mat2[i][j]; 

                }
            System.out.println("");
        }*/
                  // print the reverse number in array
       /*   int [] arr = {1,21,3,4,5,34,67};
         int l = arr.length;
         int n = Math.floorDiv(l, 2);
         int temp;

         for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1]= temp;
         }
         for(int element:arr){
            System.out.print(element+" ");
         } */
   
           
            // find the minimum number in array:

        /*  int [] arr = {1,21,3,4,5,34,67};
         int max= Integer.MIN_VALUE;
         for(int e: arr){
            if(e>max){
                max = e; 
            }
         }

         System.out.println("the value of the maximum element in this array is:"+ max);

         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);
         */ 
        }

}