// Read 2 matrices from the console and perform matrix addition.

import java.util.Scanner;


public class MatrixAddition {
    public static void main(String[] args) {
	
	int row1,col1,row2,col2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the first matrix : ");
        row1 = sc.nextInt();
        System.out.println("Enter the number of columns of the first matrix : ");
        col1 = sc.nextInt();
	System.out.println("Enter the number of rows of the second matrix : ");
        row2 = sc.nextInt();
        System.out.println("Enter the number of columns of the second matrix : ");
        col2 = sc.nextInt();


        int first[][] = new int[row1][col1];
        int second[][] = new int[row2][col2];
        

        System.out.println("Enter the elements of the first matrix : ");
        for (int i = 0; i < row1; i++) {
            for (int k = 0; k < col1; k++) {
                first[i][k] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix : ");
        for (int i = 0; i < row2; i++) {
            for (int k = 0; k < col2; k++) {
                second[i][k] = sc.nextInt();
            }
        }

        System.out.println("Elements of first matrix are : ");
        for (int i = 0; i < row1; i++) {
            for (int k = 0; k < col1; k++) {
                System.out.print(first[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("Elements of second matrix are : ");
        for (int i = 0; i < row2; i++) {
            for (int k = 0; k < col2; k++) {
                System.out.print(second[i][k] + " ");
            }
            System.out.println();
        }
	
	if(row1==row2 && col1==col2){
	int sum[][] = new int[row1][col1];
        System.out.println("The sum of two matrix are : ");
        for (int i = 0; i < row1; i++) {
            for (int k = 0; k < col1; k++) {
                sum[i][k] = first[i][k] + second[i][k];
                System.out.print(sum[i][k] + " ");
            }
            System.out.println();
        }
    	}
	else{
	System.out.println("addition is not possible");
	}
	
 }
	
}