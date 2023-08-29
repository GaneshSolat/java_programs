import java.util.Scanner;
public class matrix1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int i, j;
        boolean isidentity = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix...!");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if ((i == j && arr[i][j] == 1) || i != j && arr[i][j] == 0) {
                } else {
                    isidentity = false;
                }
            }
        }
        if (isidentity == true) {
            System.out.println("this is identity: matrix:");
        } else {
            System.out.println("this not identity matrix:");
        }

    }
}
