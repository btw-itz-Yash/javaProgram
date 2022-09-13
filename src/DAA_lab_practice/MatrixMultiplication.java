package DAA_lab_practice;
/*
MATRIX MULTIPLICATION SIMPLE BY FOR LOOP
 T(n) = O(n^3);
 */

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B, int r1, int c1, int c2) {
        int[][] C = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public static void displayProduct(int[][] C) {
        System.out.println("Product of two matrices is: ");
        for (int i=0;i< C.length;i++) {
            for (int j=0;j<C[0].length;j++) {
                System.out.print(C[i][j] + "    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter size of Second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of first matrix");
        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter elements of first matrix");
        for(int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                B[i][j]= sc.nextInt();
            }
        }
        int[][] product = multiplyMatrices(A, B , r1, c1, c2);
        displayProduct(product);
    }
}



